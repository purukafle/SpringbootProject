package com.springboot.Runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Patric", "Patel");
		
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Dipak", "jha"));
		students.add(new Student("Ram", "Misra"));
		students.add(new Student("Raj", "kuwar"));
		students.add(new Student("Nil", "Devish"));
		return students;
		
	}
	

}
