/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentProject.Entities;

/**
 *
 * @author shivn
 */
public class Student {
    private long id;
    private String name;
    private String className;
    private String sectionName;

    public Student(long id, String name, String className, String sectionName) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.sectionName = sectionName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", className=" + className + ", sectionName=" + sectionName + '}';
    }
}
