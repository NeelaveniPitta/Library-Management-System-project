package com.ashi.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ashi.model.Book;
import com.ashi.model.Issue;
import com.ashi.model.Student;
import com.ashi.repository.BookRepository;
import com.ashi.repository.IssueRepository;
import com.ashi.repository.StudentRepository;


@Controller
@RequestMapping("/issues")
public class IssueController {

	private final IssueRepository issueRepository;
	private final BookRepository bookRepository;
	private final StudentRepository studentRepository;
	
	public IssueController(IssueRepository issueRepository, BookRepository bookRepository, StudentRepository studentRepository) {
		this.issueRepository=issueRepository;
		this.bookRepository=bookRepository;
		this.studentRepository=studentRepository;
	}
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("issue", issueRepository.findAll());
		return "issues";
	}
	
	@GetMapping("/issue")
	public String showIssueForm(Model model) {
		model.addAttribute("students", studentRepository.findAll());
	    model.addAttribute("books", bookRepository.findByAvailableTrue()); 
	    return "issue-form";
	}
	
	@PostMapping("/issue")
	  public String issue(@RequestParam Long studentId, @RequestParam Long bookId) {
	    Student s = studentRepository.findById(studentId).orElseThrow();
	    Book b = bookRepository.findById(bookId).orElseThrow();

	    if (!Boolean.TRUE.equals(b.getAvailable())) {
	     
	      return "redirect:/issues";
	    }

	    Issue i = new Issue();
	    i.setStudent(s);
	    i.setBook(b);
	    i.setIssueDate(LocalDate.now());
	    issueRepository.save(i);

	    b.setAvailable(false);          
	    bookRepository.save(b);

	    return "redirect:/issues";
	  }

	  @GetMapping("/return/{id}")
	  public String returnBook(@PathVariable Long id) {
	    Issue i = issueRepository.findById(id).orElseThrow();
	    if (i.getReturnDate() == null) {
	      i.setReturnDate(LocalDate.now());
	      issueRepository.save(i);

	      Book b = i.getBook();
	      b.setAvailable(true);          
	      bookRepository.save(b);
	    }
	    return "redirect:/issues";
	  }
	
}
