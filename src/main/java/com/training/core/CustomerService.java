package com.training.core;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.model.Customer;
import com.training.repository.CostumerRepository;
import com.training.repository.CostumerRepositoryImpl;

@org.springframework.stereotype.Service
public class CustomerService implements Service  {

    @Autowired
    private CostumerRepository repository;

    @Override
    public List<Customer> customers() {
        return repository.getCustomers();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        repository.addCustomer(customer);
        return customer;
    }

    @Override
    public Customer getCustomerById(int id) {
        return repository.getCustomerById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        repository.getCustomers().add(id,customer);
        return customer;
    }
}
