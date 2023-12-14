package com.septa.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.septa.Ecommerce.model.Customer;
import org.springframework.stereotype.Service;
import com.septa.Ecommerce.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
