package com.rama.springDemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student("Dinesh 1", "Kumar", LocalDate.now(),31,"dineshkumarcse0060@gmail.com"),
                new Student("Dinesh 2", "Kumar 2", LocalDate.now(),31,"dkcse0060@gmail.com")
        );
    }
}
