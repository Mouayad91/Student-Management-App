package com.sms.app.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.app.dto.StudentDto;
import com.sms.app.service.StudentService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Controller
public class StudentsController {
    
private StudentService studentService;


@GetMapping("/students")
public String getAllStudentsList(Model model) {
   

  List<StudentDto> students = studentService.getAllStudents();   
   
  model.addAttribute("students", students);
   
    return "students";

}

@GetMapping("/students/add")
public String addNewStudent(Model model) {


    StudentDto studentDto = new StudentDto();
    model.addAttribute("student", studentDto);
    return "add-student";



}

@PostMapping("/students")
public String saveStudent(@Valid @ModelAttribute("student") StudentDto student, BindingResult result, Model model) {


    if(result.hasErrors()) {

      model.addAttribute("student", student);
      return "add-student";

    }

    studentService.addStudent(student);
    
    return "redirect:/students";

}
}