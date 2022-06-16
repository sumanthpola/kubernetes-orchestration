package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
//{"http://localhost:8080","http://localhost:4200","http://localhost"}
@CrossOrigin(origins ="*",allowedHeaders="*" )
@RestController
@RequestMapping
public class StudentController {

	@Autowired
	private StudentRepository studentRep;
	
		@GetMapping("/survey")
		public List<Student> getAllStudents(){
			return studentRep.findAll();
		}
		
		@PostMapping("/survey")
		@ResponseBody
		public Student addStudent(@RequestBody Student student) {
			return studentRep.save(student);
		}
}
