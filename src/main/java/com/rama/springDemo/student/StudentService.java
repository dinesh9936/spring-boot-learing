package com.rama.springDemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {


    Student save(Student s);

    List<Student> findAllStudents();
}
