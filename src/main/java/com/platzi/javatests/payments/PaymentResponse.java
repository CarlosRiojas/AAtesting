package com.platzi.javatests.payments;

public class PaymentResponse {
    private PaymentStatus status;


    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    enum PaymentStatus {
        OK,ERROR;

    }

    public PaymentStatus getStatus() {
        return status;
    }
}
