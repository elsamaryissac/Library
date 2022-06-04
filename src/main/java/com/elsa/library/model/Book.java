package com.elsa.library.model;

import java.util.Date;

public class Book {

	private String title;
	private String subject;
	private String author;
	private String publisher;
	private Integer editionNumber;
	private Integer id;
	private Date publicationDate;
	private Boolean active;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", subject=" + subject + ", author=" + author + ", publisher=" + publisher
				+ ", editionNumber=" + editionNumber + ", id=" + id + ", publicationDate=" + publicationDate
				+ ", active=" + active + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
