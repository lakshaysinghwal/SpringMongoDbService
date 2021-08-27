package com.spring.MongoMicroService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.MongoMicroService.model.*;
import com.spring.MongoMicroService.repository.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeesController {
	@Autowired
	private EmployeesRepository repo;
	
	@PostMapping("/addEmp")
	
	public String saveEmployee(@RequestBody Employees emp)
	{
		repo.save(emp);
		return "Employee added with id"+emp.getId();
	}
	
	@GetMapping("/findAllEmp")
	public List<Employees> getEmployees(){
		return repo.findAll();		
	}

	@GetMapping("/findAllEmp/{id}")
	public Optional<Employees> getEmployees(@PathVariable int id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")	
	public String deleteBook(@PathVariable int id) {
		repo.deleteById(id);
		return "Employee deleted with id"+id;
	}
}
