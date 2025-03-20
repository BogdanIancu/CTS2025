package com.netflex.singleton;

public class PaymentServiceVersion2 {
    public static final PaymentServiceVersion2 instance =
            new PaymentServiceVersion2();
    private double balance = 100;

    private PaymentServiceVersion2() {
    }

    public double getBalance() {
        return balance;
    }

    public void pay(double amount) {
        System.out.println("Initialing payment...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(balance - amount >= 0) {
            System.out.println("User paid $" + amount);
            balance -= amount;
        } else {
            System.out.println("Not enough credits");
        }
    }
}
