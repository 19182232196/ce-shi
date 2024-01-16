package com.tx_annotation.service;

public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);
}
