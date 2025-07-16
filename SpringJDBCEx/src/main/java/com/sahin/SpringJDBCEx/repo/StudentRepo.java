package com.sahin.SpringJDBCEx.repo;

import com.sahin.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {


    public void save(Student student) {
        System.out.println("Added!");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
