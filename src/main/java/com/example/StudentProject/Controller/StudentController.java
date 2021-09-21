/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentProject.Controller;

import com.example.StudentProject.Entities.Student;
import com.example.StudentProject.Interface.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shivn
 */
@RestController
public class StudentController {
    
    @Autowired
    public StudentService serviceObj;
    
    @GetMapping("/Students")
    public List<Student> getStudent()
    {
        return serviceObj.getStudents();
    }
}
