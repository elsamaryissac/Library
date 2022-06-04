package com.elsa.library.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elsa.library.component.BookDatabase;
import com.elsa.library.model.Book;
import com.elsa.library.services.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
	private BookDatabase bookDatabase;
	@Override
	public Book addBook(Book book) {
		book.setPublicationDate(new Date());
		bookDatabase.add(book);
		return book;
		
	}
	

	@Override
	public List<Book> getBookList() {
		return bookDatabase.getBookList();
	}

}
