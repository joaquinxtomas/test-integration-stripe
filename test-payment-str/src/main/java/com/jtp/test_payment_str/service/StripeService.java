package com.jtp.test_payment_str.service;

import com.jtp.test_payment_str.dto.ProductRequest;
import com.jtp.test_payment_str.dto.StripeResponse;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    @Value("${stripe.secretKey}")
    private String stripeSecretKey;

    public StripeResponse checkoutProducts(ProductRequest productRequest){
        Stripe.apiKey=stripeSecretKey;

        SessionCreateParams.LineItem.PriceData.ProductData productData = SessionCreateParams.LineItem.PriceData.ProductData.builder()
                .setName(productRequest.getName()).build();

        SessionCreateParams.LineItem.PriceData priceData = SessionCreateParams.LineItem.PriceData.builder()
                .setCurrency(productRequest.getCurrency() != null ? productRequest.getCurrency() : "USD")
                .setUnitAmount(productRequest.getAmount())
                .setProductData(productData)
                .build();

        SessionCreateParams.LineItem lineItem = SessionCreateParams.LineItem.builder()
                .setQuantity(productRequest.getQuantity())
                .setPriceData(priceData)
                .build();

        SessionCreateParams params = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("http://localhost:8081/success")//your route
                .setCancelUrl("http://localhost:8081/cancel")//your route
                .addLineItem(lineItem)
                .build();

        Session session = null;

        try{
            session = Session.create(params);
        }catch(StripeException strE){
            System.out.println(strE.getMessage());
        }

        return new StripeResponse(
                "SUCCESS",
                "payment session created",
                session.getId(),
                session.getUrl()
        );
    }

}
