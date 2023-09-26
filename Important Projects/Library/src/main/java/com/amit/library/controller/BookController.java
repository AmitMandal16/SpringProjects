package com.amit.library.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amit.library.model.Book;
import com.amit.library.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService<Book> bookService;
	
	@GetMapping("/listbooks")
	public String viewBook(Model model) {
		
		model.addAttribute("book", bookService.viewBooks());
		
		return "books_view";
		
	}
	
	@GetMapping("/showBookForm")
	public String showAddBook(@ModelAttribute("book") Book b) {
		
		return "books_add";
	}
	
	@PostMapping("/addbook")
	public String addbook(@ModelAttribute("book") Book b) {
		
		bookService.addBook(b);
		
		return "redirect:listbooks";
		
	}
	
	@GetMapping("/editbook/{id}")
	public String editBook(@PathVariable int id, Model model) {
		
		Optional<Book> b= bookService.showBookById(id);
		
		model.addAttribute("book", b);
		
		return "books_edit";
	}
	
	@PostMapping("/editbook/edit")
	public String update(@ModelAttribute("book") Book b) {
		
		bookService.updateBook(b);
		
		return "redirect:/listbooks";
	}
	
	@GetMapping(value="/deletebook/{id}")  
    public String delete(@PathVariable("id") int id, Model model) {  
        System.out.println("reached delete method");
    	Optional<Book> book = bookService.showBookById(id); 

        model.addAttribute("book", book);

        return "books_delete";  
    }

	
	
	 @PostMapping("/deletebook/delete")    
	    public String deleteBook(@ModelAttribute("book") Book book ) {    
		 System.out.println("reached delete method main");
	    	bookService.deleteBook(book.getId());
	    	
	        return "redirect:/listbooks";
	    }

}
