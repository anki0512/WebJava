package com.sunbeam.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.entities.Book;

@Component
public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		
int id = rs.getInt("BookID");
String name = rs.getString("BookName");
String author = rs.getString("AuthorName");
String subject = rs.getString("Subject");
double price = rs.getDouble("Price");
Book b = new Book(id, name, author, subject, price);		
return b;
	}

}
