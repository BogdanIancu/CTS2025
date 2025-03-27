package com.netflex.singletonregistry;

public class PaymentService {
    PaymentService(){}

    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }
}
