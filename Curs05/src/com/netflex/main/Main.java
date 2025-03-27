package com.netflex.main;

import com.netflex.factorymethod.AbstractSubscriptionFactory;
import com.netflex.factorymethod.TvProviderSubscriptionFactory;
import com.netflex.simplefactory.Subscription;
import com.netflex.simplefactory.SubscriptionFactory;
import com.netflex.simplefactory.SubscriptionFactoryVersion2;
import com.netflex.simplefactory.SubscriptionType;
import com.netflex.singletonregistry.Logger;
import com.netflex.singletonregistry.PaymentService;
import com.netflex.singletonregistry.SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry = new SingletonRegistry();
        Logger logger =
                (Logger) singletonRegistry.getSingleton(SingletonRegistry.LOGGER);
        logger.log("Message");
        PaymentService paymentService =
                (PaymentService) singletonRegistry.getSingleton(SingletonRegistry.PAYMENT);
        paymentService.pay(100);

        SubscriptionFactory factory = new SubscriptionFactory();
        Subscription subscription = factory.getSubscription("UHD");
        subscription.renderContent();

        SubscriptionFactoryVersion2 factoryVersion2 =
                new SubscriptionFactoryVersion2();
        subscription = factoryVersion2.getSubscription(SubscriptionType.FULL_HD);
        subscription.renderContent();

        AbstractSubscriptionFactory factoryMethod =
                new TvProviderSubscriptionFactory();
        com.netflex.factorymethod.Subscription otherSubscription =
                factoryMethod.getSubscription(AbstractSubscriptionFactory.FHD);
        otherSubscription.renderContent();


    }
}
