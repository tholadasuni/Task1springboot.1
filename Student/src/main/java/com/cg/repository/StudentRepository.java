

package com.cg.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.entity.Student;

public interface StudentRepository extends MongoRepository < Student, Long>{

 public	List<Student> findStudentByName(String name);
	

}

