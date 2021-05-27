package com.cg.sec.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.sec.entities.Students;
import com.cg.sec.service.IStudentService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	@GetMapping("/{name}")
	@ApiOperation("Greetings from the API")
	public String greetings(@PathVariable String name) {
		return "<h1> Welcome to Spring Boot Student API " +name+"</h1>";
	}

	@PostMapping("/save")
	public void save(@RequestBody Students student) {
		service.addStudent(student);
	}
	
	@GetMapping("/getById{id}")
	@ApiOperation("get Student by ID")
	public Students FetchById(@PathVariable String id) {
		return service.fetchById(Integer.valueOf(id));
	}
	
	@GetMapping("/getAll")
	@ApiOperation("Fetch all Students Details")
	public List<Students> fetch(){
		return service.fetchAll();
	}

	@PutMapping("/update")
	public void update(@RequestBody Students student) {
		service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		service.delStudent(Integer.valueOf(id));
	}
}
