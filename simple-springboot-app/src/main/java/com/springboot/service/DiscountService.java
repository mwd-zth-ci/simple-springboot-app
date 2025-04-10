package com.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double calculateDiscount(double totalAmount, String customerType) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if ("VIP".equals(customerType)) {
            return totalAmount * 0.2;
        } else if ("REGULAR".equals(customerType)) {
            return totalAmount * 0.1;
        } else {
            return 0;
        }
    }
}
