package com.elsa.library.services;

import java.util.List;

import com.elsa.library.model.Book;

public interface BookService {

	public Book addBook(Book book);
	public List<Book> getBookList();
}
