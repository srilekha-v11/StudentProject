package com.cg.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sec.entities.Students;

public interface IStudentRepository extends JpaRepository<Students, Integer> {

}
