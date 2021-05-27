package com.cg.sec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sec.entities.Students;
import com.cg.sec.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentRepository repository;
	@Override
	public void addStudent(Students student) {
		repository.save(student);
		
	}

	@Override
	public List<Students> fetchAll() {
		return repository.findAll();
	}

	@Override
	public void delStudent(int id) {
		repository.deleteById(id);;
		
	}

	@Override
	public void updateStudent(Students student) {
		repository.save(student);
		
	}

	@Override
	public Students fetchById(int id) {
		Students stu = null;
		Optional<Students>optional=repository.findById(id);
		if(optional.isPresent())
			stu=optional.get();
		return stu;
	}

}
