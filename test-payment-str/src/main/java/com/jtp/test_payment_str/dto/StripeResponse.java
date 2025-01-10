package com.jtp.test_payment_str.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Obtaining information from stripe")
public class StripeResponse {

    @Schema(description = "Payment status")
    private String status;
    @Schema(description = "Message obtained from stripe")
    private String message;
    @Schema(description = "Stripe session ID")
    private String sessionId;
    @Schema(description = "Stripe session URL where the user can complete the payment")
    private String sessionUrl;

    public StripeResponse() {
    }

    public StripeResponse(String status, String message, String sessionId, String sessionUrl) {
        this.status = status;
        this.message = message;
        this.sessionId = sessionId;
        this.sessionUrl = sessionUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionUrl() {
        return sessionUrl;
    }

    public void setSessionUrl(String sessionUrl) {
        this.sessionUrl = sessionUrl;
    }
}
