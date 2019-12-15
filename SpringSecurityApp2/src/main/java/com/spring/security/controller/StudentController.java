package com.spring.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.StudentModel;

@RestController
public class StudentController {

	@GetMapping("/")
	public ResponseEntity<?> getStudents() {
		List<StudentModel> students = getStudentsList();
		return new ResponseEntity<List<StudentModel>>(students, HttpStatus.OK);

	}

	public List<StudentModel> getStudentsList() {
		List<StudentModel> listStudents = new ArrayList<StudentModel>();
		listStudents.add(new StudentModel(1, "Rama", 50, "Bangalore"));
		listStudents.add(new StudentModel(2, "Mohan", 60, "Hyderabad"));
		return listStudents;

	}

}
