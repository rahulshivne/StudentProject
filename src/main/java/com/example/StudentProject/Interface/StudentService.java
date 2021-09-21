/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentProject.Interface;

import com.example.StudentProject.Entities.Student;
import java.util.List;

/**
 *
 * @author shivn
 */
public interface StudentService {
    public List<Student> getStudents();
    public List<Student> addStudent(Student s);
    public Student findStudent(long id);
}
