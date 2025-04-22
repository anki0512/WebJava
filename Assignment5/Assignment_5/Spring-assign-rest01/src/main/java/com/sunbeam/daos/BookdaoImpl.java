package com.sunbeam.daos;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunbeam.entities.Book;
@Repository
public class BookdaoImpl implements BookDao {
@Autowired
	private JdbcTemplate jdbcTemplate;

@Autowired
    private RowMapper<Book> bookRowMapper;

	
	@Override
	public List<Book> getAllBooks() {
	String sql = "SELECT * FROM books";
	List<Book> list = jdbcTemplate.query(sql, bookRowMapper);
	return list;
	}

	@Override
	public Book getbookById(int id) {
    String sql = "SELECT * FROM books WHERE BookID = ?";
    List<Book> list =jdbcTemplate.query(sql, bookRowMapper, id);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public int saveNewBook(Book b) {
	String sql = "INSERT INTO books(BookID , BookName , AuthorName , Subject ,Price ) VALUES(?, ?, ?, ?, ?)";
	int count = jdbcTemplate.update(sql, b.getId(), b.getName(), b.getAuthor(), b.getSubject(), b.getPrice());
		return count;
	}

	@Override
	public int updateBook(Book b) {
	 String sql = "UPDATE books SET BookName = ?, AuthorName = ?, Subject = ?, Price = ? WHERE BookID = ? ";
	 int count = jdbcTemplate.update(sql, b.getName(), b.getAuthor(), b.getSubject(), b.getPrice(), b.getId());
		return count;
	}

	@Override
	public int delectById(int id) {
		String sql = "DELETE FROM books WHERE BookID = ? ";
		int count = jdbcTemplate.update(sql, id);
		return count;
	}

}
