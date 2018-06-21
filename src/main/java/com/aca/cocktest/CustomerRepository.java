package com.aca.cocktest;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository  extends CrudRepository<Customer, Long> {
}
