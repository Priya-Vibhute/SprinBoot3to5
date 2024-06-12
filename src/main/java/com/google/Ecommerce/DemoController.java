package com.google.Ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/data")
	public String getData()
	{
		return "Hello Spring Boot";
	}
	
	
	@GetMapping("/student")
	public Student getStudent()
	{
		
		return new Student(101,"Nishani");
		
	}
	
	@GetMapping("/all-students")
	public List<Student> allStudent()
	{
	List<Student> students=	new ArrayList<Student>();
	students.add(new Student(101, "Nitya"));
	students.add(new Student(102, "sheshmani"));
	students.add(new Student(101, "Brijesh"));
	students.add(new Student(104, "Sayli"));
	students.add(new Student(105, "Fatima"));
	
	return students;
	
	
	}
	
	@GetMapping("/message")
	public ResponseEntity<String> writeMessage()
	{
		return new ResponseEntity<String>("Hello Spring Boot", HttpStatus.OK);
	}
	
	@GetMapping("/student-details")
	public ResponseEntity<List<Student>>  getAllStudent()
	{
		List<Student> students=	new ArrayList<Student>();
		students.add(new Student(101, "Nitya"));
		students.add(new Student(102, "sheshmani"));
		students.add(new Student(101, "Brijesh"));
		students.add(new Student(104, "Sayli"));
		students.add(new Student(105, "Fatima"));
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/add-student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		
	
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
	
	
	

}
