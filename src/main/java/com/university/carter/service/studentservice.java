package com.university.carter.service;

import com.university.carter.model.studentmodel;

import java.util.List;

public interface studentservice {
    studentmodel registerStudent(studentmodel student);
    studentmodel updateStudent(studentmodel student);
    void deleteStudent(Long id);
    List<studentmodel> StudentList();
    studentmodel findStudentById(Long id);
}
