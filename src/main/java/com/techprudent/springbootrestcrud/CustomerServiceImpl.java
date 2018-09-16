package com.techprudent.springbootrestcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	private CustomerRepo cr;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepo cr) {
		super();
		this.cr = cr;
	}
	
	@Override
	public boolean deleteCustomer(long id) {
		cr.deleteById(id);
		return true;
	}

	
	@Override
	public Customer updateCustomer(Customer updateCustomer) {
		
		Customer customer = cr.findById(updateCustomer.getId()).get();
		
		customer.setContact(updateCustomer.getContact());
		customer.setGender(updateCustomer.getGender());
		customer.setName(updateCustomer.getName());
		
		
		return cr.save(customer);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return cr.save(customer);
	}

	@Override
	public Customer getCustomer(long id) {
		return cr.findById(id).get();
	}

}
