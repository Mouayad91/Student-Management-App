package com.sms.app.mapper;

import com.sms.app.dto.StudentDto;
import com.sms.app.entity.Students;

public class StudentMapper {
    


    public static StudentDto mapToStudentDto(Students student) {
        
        StudentDto studentDto = new StudentDto(
            student.getId(),
            student.getFirstName(),
            student.getLastName(),
            student.getBirthDate(),
            student.getPhoneNumber(),
            student.getEmail(),
            student.getEnrollmentDate()
        );

        return studentDto;
    }


    public static Students mapToStudents(StudentDto studentDto) {

        Students student = new Students(
            studentDto.getId(),
            studentDto.getFirstName(),
            studentDto.getLastName(),
            studentDto.getBirthDate(),
            studentDto.getPhoneNumber(),
            studentDto.getEmail(),
            studentDto.getEnrollmentDate()
        );

        return student;
    }
}
