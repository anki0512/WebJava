package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.entities.Book;

public interface BookDao {

	List<Book> getAllBooks();
	
	Book getbookById(int id);
	
	int saveNewBook(Book b);
	
	int updateBook(Book b);
	
	int delectById(int id);
	
}


//get book by id
//save new book
//update book
//delete book by id