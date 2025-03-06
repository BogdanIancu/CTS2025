package com.netflex.solid.services;

import com.netflex.solid.contracts.InvoiceService;
import com.netflex.solid.contracts.UserContract;

public class PlatformInvoiceService implements InvoiceService {
    @Override
    public void generateInvoice(UserContract user) {
        System.out.println("Invoice generated for " + user.getName() + " for the " + user.getPlan() + " plan.");
    }
}
