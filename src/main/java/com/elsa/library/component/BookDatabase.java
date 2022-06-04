package com.elsa.library.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.elsa.library.model.Book;

@Component
public class BookDatabase {

	private List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void add(Book book) {
		if(this.bookList == null) {
			this.bookList = new ArrayList<Book>();
		}
		this.bookList.add(book);
	}
}
