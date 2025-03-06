package com.netflex.solid.contracts;

public interface UserContract {
    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    String getPlan();

    void setPlan(String plan);
}
