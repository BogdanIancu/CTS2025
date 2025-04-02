package com.netflex.abstractfactory;

public class OnlineCardPayment implements Payment {
    public static final int CARD_PAYMENT_PRICE = 300;

    @Override
    public float getPrice() {
        return CARD_PAYMENT_PRICE;
    }
}
