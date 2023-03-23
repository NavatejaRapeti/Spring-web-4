package com.example.demo.springJPAWeb4.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.springJPAWeb4.data.entity.*;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

    Student findById( int id );

}
