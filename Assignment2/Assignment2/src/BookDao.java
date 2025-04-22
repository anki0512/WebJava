import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements AutoCloseable{
	private Connection con;
	public BookDao()throws Exception {
		con=DbUtil.getConnection();
	}
	public void close() throws SQLException {
		if(con!=null) {
			con.close();
		}
	}
	public List<Book> findall() {
		List<Book> list=new ArrayList<Book>();
		String sql="Select * from Books;";
		try(PreparedStatement stm=con.prepareStatement(sql)){
			try(ResultSet rs=stm.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book book=new Book(id,name,author,subject,price);
					list.add(book);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public Book findbyId(int BookId){
		String sql="Select * from Books where id =?";
		try(PreparedStatement stm=con.prepareStatement(sql)){
			stm.setInt(1,BookId);
			try(ResultSet rs=stm.executeQuery()){
				if(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book book=new Book(id,name,author,subject,price);
					return book;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int save(Book b) throws Exception{
		String sql="INSERT INTO books VALUES (?, ?, ?, ?, ?)";
		try(PreparedStatement stm=con.prepareStatement(sql)){
			stm.setInt(1, b.getId());
			stm.setString(2, b.getName());
			stm.setString(3, b.getAuthor());
			stm.setString(4, b.getSubject());
			stm.setDouble(5, b.getPrice());
			int count = stm.executeUpdate();
			return count;
		}	
	}
	public int update(Book b) throws Exception {
		String sql = "UPDATE books SET name = ?, author = ?, subject = ?, price = ? WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, b.getName());
			stmt.setString(2, b.getAuthor());
			stmt.setString(3, b.getSubject());
			stmt.setDouble(4, b.getPrice());
			stmt.setInt(5, b.getId());
			int count = stmt.executeUpdate();
			return count;
		}
	}

}
