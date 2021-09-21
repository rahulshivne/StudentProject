/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentProject.Interface;

import com.example.StudentProject.Entities.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author shivn
 */
@Service
public class StudentServiceImpl implements StudentService{

    List<Student> studentList;
    
    public StudentServiceImpl() {
        studentList = new ArrayList();
        studentList.add(new Student(1,"Ramesh","2nd","A"));
        studentList.add(new Student(2,"Anvi","2nd","B"));
        studentList.add(new Student(1,"Dinesh","2nd","A"));
    }

    
    @Override
    public List<Student> getStudents() {
        return studentList;
    }

    @Override
    public List<Student> addStudent(Student s) {
        studentList.add(s);
        return studentList;
    }

    @Override
    public Student findStudent(long id) {
            for(Student s : studentList )
            {
                if (s.getId()==id)
                    return s;
            }
            return null;
    }
    
}
