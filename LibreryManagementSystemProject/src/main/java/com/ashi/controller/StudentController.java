package com.ashi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashi.model.Student;
import com.ashi.repository.StudentRepository;


@Controller
@RequestMapping("/students")
public class StudentController {

	private final StudentRepository studentRepository;
	
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	
	@GetMapping
	public String listStudents(Model model) {
		 model.addAttribute("students", studentRepository.findAll());
	     return "students"; 
		
	}
	
	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("student", new Student());
		return "add-student";
	}
	
	@PostMapping("/add")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentRepository.save(student);
        return "redirect:/students";
    }
}
