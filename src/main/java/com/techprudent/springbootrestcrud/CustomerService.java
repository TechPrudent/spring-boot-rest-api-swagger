package com.techprudent.springbootrestcrud;

public interface CustomerService {

	public boolean deleteCustomer(long id) ;

	public Customer updateCustomer(Customer updateCustomer);

	public Customer createCustomer(Customer customer) ;

	public Customer getCustomer(long id) ;

}
