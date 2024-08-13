package com.sms.app.service;

import java.util.List;

import com.sms.app.dto.StudentDto;

public interface StudentService {
    
    List<StudentDto> getAllStudents();

    void addStudent(StudentDto student);


}
