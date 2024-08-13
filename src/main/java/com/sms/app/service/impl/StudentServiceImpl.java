package com.sms.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.app.dto.StudentDto;
import com.sms.app.entity.Students;
import com.sms.app.mapper.StudentMapper;
import com.sms.app.repository.StudentRepository;
import com.sms.app.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements  StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudents() {
     
        List<Students> students = studentRepository.findAll();
        List<StudentDto> studentDtos = students.stream()
        .map((student)->StudentMapper.mapToStudentDto(student))
        .collect(Collectors.toList());

        return studentDtos; 
    }
    @Override
    public void addStudent(StudentDto student) {
       
        Students newStudent = StudentMapper.mapToStudents(student);
        studentRepository.save(newStudent);
    }
    




}
