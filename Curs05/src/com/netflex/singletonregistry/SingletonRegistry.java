package com.netflex.singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    public static final String LOGGER = "logger";
    public static final String API = "api";
    public static final String PAYMENT = "payment";
    private static Map<String, Object> collection = new HashMap<>();

    static {
        collection.put(LOGGER, new Logger());
        collection.put(API, new ApiConnection());
        collection.put(PAYMENT, new PaymentService());
    }

    public Object getSingleton(String key) {
        if(collection.containsKey(key)) {
            return collection.get(key);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
