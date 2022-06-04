package com.elsa.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsa.library.model.Book;
import com.elsa.library.services.BookService;

@RestController
@RequestMapping(value="service/book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public ResponseEntity<Book> add(@RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.addBook(book), HttpStatus.OK);
	}
	
	@GetMapping("/getlist")
	public ResponseEntity<?> getList(){
		bookService.getBookList();
		return new ResponseEntity<List<Book>>(bookService.getBookList(), HttpStatus.OK);
	}
}
