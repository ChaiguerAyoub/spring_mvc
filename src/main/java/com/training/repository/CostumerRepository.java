package com.training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.model.Customer;

public interface CostumerRepository {
    List<Customer> getCustomers();
    Customer addCustomer(Customer customer);
    Customer getCustomerById(int id);

}
