package com.tns.service;
import com.tns.entity.Student;
public interface StudentService {
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract Student findStudentById(int id);
}
