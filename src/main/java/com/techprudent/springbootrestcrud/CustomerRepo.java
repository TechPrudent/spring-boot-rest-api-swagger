package com.techprudent.springbootrestcrud;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

}
