package com.example.demo.springJPAWeb4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.springJPAWeb4.data.entity.*;
import com.example.demo.springJPAWeb4.repository.*;

@Service
public class StudentServiceImpl implements StudentService
{

    private final StudentRepository studentsRepository;

    public StudentServiceImpl( @Autowired StudentRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }

    @Override
    public Student save( Student student )
    {
       return  studentsRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }

	

	
}