package com.sunbeam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.daos.BookDao;
import com.sunbeam.entities.Book;

@RequestMapping("/v1")
@RestController
public class BookRestControllerV1 {
@Autowired
private BookDao bookDao;


@GetMapping("/books")
public List<Book> findBooks(){
	List<Book> list = bookDao.getAllBooks();
	return list;
}
	
@GetMapping("/books/{id}")
public Book findById(@PathVariable("id") int id)
{
	Book b = bookDao.getbookById(id);
	return (Book) b;
}
@PostMapping("/books")
public String save(@RequestBody Book b) {
	int count = bookDao.saveNewBook(b);
	if(count == 1)
		return "Book Update";
	return"Book not updated";
}
@PutMapping("/books/{id}")
public String modifyBook(@PathVariable("id") int id,  @RequestBody Book b) {
	b.setId(id);
	int count = bookDao.updateBook(b);
	if(count == 1)
		return "Book Updated";
	return "Book not Updated";
}
@DeleteMapping("/books/{id}")
public String deleteBook(@PathVariable("id") int id) {
int count = bookDao.delectById(id);
if(count == 1)
	return "Book deleted";
return "Book not deleted";
}
	
}


