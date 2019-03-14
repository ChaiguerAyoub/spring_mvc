package com.training.core;

import java.util.List;

import org.springframework.scheduling.support.SimpleTriggerContext;

import com.training.model.Customer;

@org.springframework.stereotype.Service
public interface Service {
    List<Customer> customers();
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(int id);
    Customer updateCustomer(Customer customer, int id);
}
