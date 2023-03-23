package com.example.demo.springJPAWeb4.services;

import com.example.demo.springJPAWeb4.data.entity.*;

public interface StudentService {

	
	 Iterable<Student> all();

	    Student get( int studentId );

	    Student save( Student student );

	    void delete( int studentId );

}
