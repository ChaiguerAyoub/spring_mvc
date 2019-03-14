package com.training.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.model.Customer;

@Repository
public class CostumerRepositoryImpl implements CostumerRepository {

    private List<Customer> customersList;

    public CostumerRepositoryImpl(List<Customer> customersList) {
        this.customersList = new ArrayList<>();
    }

    @Override
    public List<Customer> getCustomers() {
        return customersList;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customersList.add(customer);
        return customer;
    }

    @Override
    public Customer getCustomerById(int id) throws IndexOutOfBoundsException{
        Customer customer;
        try {
            customer = customersList.get(id);
        } catch (IndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException("No element in that index was found");
        }
        return customer;
    }

}
