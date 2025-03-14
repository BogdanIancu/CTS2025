package com.netflex.dip;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class IocContainer {
    public void initialize(Object instance) {
        for (Field f : instance.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Bean.class)) {
                try {
                    f.setAccessible(true);
                    Class<?> implementation = Class.forName(f.getType().getName().replace("Contract", ""));
                    f.set(instance, implementation.getConstructor().newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
