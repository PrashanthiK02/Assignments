package com.cg.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.ProductService;

@RestController

@RequestMapping("/api")
public class CustomerController {
	@Autowired
	ProductService service;
	@GetMapping("/hello")
 public String printHello() {	
		return "Hi Spring";
	}
	//@GetMapping("/customers")
	@GetMapping(path="/customers",produces={MediaType.APPLICATION_JSON_VALUE})
//@GetMapping(path="/customers",produces={MediaType.APPLICATION_ATOM_XML_VALUE})
	public List<Customer>viewCustomerList(){
		List<Customer> listcustomers=service.listAll();
		return listcustomers;
		}
	@GetMapping("/customers/{cid}")
	public Optional<Customer> findByProduct(@PathVariable int cid){
		return service.getProduct(cid);
	}
	@PostMapping("/customers")
	public Customer createEmployee(@valid @RequestBody Customer newCustomer)
	{
		return service.getCustomer(cid);
}
	@DeleteMapping("/customers/{id}")
	public Map<String,Boolean> deleteCustomer(@PathVariable(value="id")Integer CustomerId){
		return service.deleteProduct(customerId);
	}
	@putMapping
}
