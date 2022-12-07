package com.adem.tn.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.adem.tn.entities.Student;
import com.adem.tn.services.StudentService;
//@CrossOrigin(origins ="http://localhost:4200/")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders={"Accept"})

@RestController
@RequestMapping("/api")
@CrossOrigin

public class StudentController {

	@Autowired
	private StudentService studentService;
	@RequestMapping( method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {

		return studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getAllStudents() {

		return studentService.getStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudentById(id);;

	}

	@RequestMapping( method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}
}
