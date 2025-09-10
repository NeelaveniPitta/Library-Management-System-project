package com.ashi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ashi.model.Book;
import com.ashi.repository.BookRepository;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
	
	@GetMapping("/add")
	  public String showAddForm(Model model) {
	    model.addAttribute("book", new Book());
	    return "add-book";
	  }
	
	@PostMapping("/add")
    public String save(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "redirect:/books";
    }
	
	@GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/books";
    }
}
