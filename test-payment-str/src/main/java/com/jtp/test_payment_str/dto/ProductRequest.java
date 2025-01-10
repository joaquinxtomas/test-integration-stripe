package com.jtp.test_payment_str.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Product data")
public class ProductRequest {

    @Schema(description = "Product price")
    private Long amount;
    @Schema(description = "Quantity of products")
    private Long quantity;
    @Schema(description = "Product name")
    private String name;
    @Schema(description = "Product price currency")
    private String currency;

    public ProductRequest() {
    }

    public ProductRequest(Long amount, Long quantity, String name, String currency) {
        this.amount = amount;
        this.quantity = quantity;
        this.name = name;
        this.currency = currency;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
