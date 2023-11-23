package com.cg.repository;

import com.cg.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByName(String name);

    void deleteByName(String name);
}
