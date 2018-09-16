package com.techprudent.springbootrestcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author tech prudent
 *
 *         create, read, update, delete operations
 */
@RestController
@RequestMapping("/customer")
@Api(value = "CUSTOMER API")
public class CustomerController {

	private CustomerService cs;

	@Autowired
	public CustomerController(CustomerService cs) {
		super();
		this.cs = cs;
	}

	@GetMapping("/{id}")
	@ApiOperation(
			value = "get a customer for tester", 
			code = 200, 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			response = Customer.class)
	Customer getCustomer(@PathVariable long id) {

		return this.cs.getCustomer(id);

	}

	@PostMapping("/create")
	Customer createCustomer(@RequestBody Customer customer) {

		return this.cs.createCustomer(customer);
	}

	@PutMapping("/update")
	Customer updateCustomer(@RequestBody Customer updateCustomer) {

		return this.cs.updateCustomer(updateCustomer);
	}

	@DeleteMapping("/{id}")
	boolean deleteCustomer(@PathVariable long id) {

		boolean isDeleted = this.cs.deleteCustomer(id);

		if (isDeleted) {
			return true;
		}

		return false;

	}
}
