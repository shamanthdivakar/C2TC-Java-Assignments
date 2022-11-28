package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		// Create Operation
		student.setStudentId(8);
		student.setName("Shamanth");
		service.addStudent(student);
		//at this breakpoint, we have added one record to table
		
		// Retrieve Operation
		student = service.findStudentById(8);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		// Update Operation
		student = service.findStudentById(8);
		student.setName("Shamanth D");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(8);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName()); 
		//at this breakpoint, record is removed from table
		
		// Delete Operation
		student = service.findStudentById(8);
		service.removeStudent(student);
		System.out.println("program cycle completed");
	}
}
