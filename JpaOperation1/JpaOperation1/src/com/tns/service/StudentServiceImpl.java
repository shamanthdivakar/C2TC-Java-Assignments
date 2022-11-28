package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entity.Student;
public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	public StudentServiceImpl() 
	 {
	dao = new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = dao.getStudentById(id);
		return student;
	}
}
