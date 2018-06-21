package com.aca.cocktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.RandomStringUtils;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/init")
    public void initializeDb(){
        String genstring =  RandomStringUtils.randomAlphabetic(10);
        customerRepository.save(new Customer(genstring, ""));
    }

    @GetMapping("/customer")
    public @ResponseBody Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping("/aca")
    public void getAll(){
        for(Customer customer:  customerRepository.findAll()){
            log.info(customer.toString());
        }
    }
}
