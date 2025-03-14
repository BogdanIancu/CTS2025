package com.netflex.solid.models;

import com.netflex.solid.contracts.UserContract;

public class User implements UserContract {
    String name;
    String email;
    String plan;

    public User() {
    }

    public User(String name, String email, String plan) {
        this.name = name;
        this.email = email;
        this.plan = plan;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPlan() {
        return plan;
    }

    @Override
    public void setPlan(String plan) {
        this.plan = plan;
    }
}
