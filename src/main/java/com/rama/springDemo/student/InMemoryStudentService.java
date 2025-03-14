package com.rama.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{

    @Override
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Dinesh",
                        "Kumar",
                        LocalDate.now(),
                        21,
                        "dineshkumarcse0060@gmail.com"
                )
        );
    }
}
