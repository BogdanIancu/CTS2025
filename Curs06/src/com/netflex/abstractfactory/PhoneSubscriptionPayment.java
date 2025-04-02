package com.netflex.abstractfactory;

public class PhoneSubscriptionPayment implements Payment {
    public static final int PHONE_SUBSCRIPTION_PRICE = 100;

    @Override
    public float getPrice() {
        return PHONE_SUBSCRIPTION_PRICE;
    }
}
