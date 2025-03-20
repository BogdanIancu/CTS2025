package com.netflex.main;

import com.netflex.singleton.PaymentService;
import com.netflex.singleton.PaymentServiceVersion2;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentService.getInstance();
        paymentService.pay(20);

        Thread t = new Thread(() -> PaymentService.getInstance().pay(30));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Balance: " + paymentService.getBalance());

        PaymentServiceVersion2.instance.pay(30);
        System.out.println("Balance: " +
                PaymentServiceVersion2.instance.getBalance());
    }
}
