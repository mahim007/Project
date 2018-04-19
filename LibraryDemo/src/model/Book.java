package model;

import java.io.Serializable;

public class Book implements Serializable
{
	String bookId;
	String title;
	String author;
	float price;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	
}
