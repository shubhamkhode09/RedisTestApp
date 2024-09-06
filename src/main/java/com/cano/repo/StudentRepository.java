package com.cano.repo;

import org.springframework.data.repository.CrudRepository;

import com.cano.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
