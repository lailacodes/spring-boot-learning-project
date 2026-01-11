package com.lailacodes.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService{
    public void processPayment(double amount){
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
