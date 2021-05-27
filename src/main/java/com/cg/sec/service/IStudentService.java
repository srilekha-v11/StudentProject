package com.cg.sec.service;

import java.util.List;

import com.cg.sec.entities.Students;

public interface IStudentService {
	
	void addStudent(Students student);
	
	List<Students> fetchAll();
	
	void  delStudent(int id);
	
	void updateStudent(Students students);
	
	Students fetchById(int id);

}
