package nl.lotrac.bv.service;


import nl.lotrac.bv.model.Customer;
import nl.lotrac.bv.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerServiceImpl {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Collection<Customer>getCustomers(){

        return customerRepository.findAll();
    }



}
