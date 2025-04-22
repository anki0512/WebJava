import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class Jdbc_Main {
	private static Scanner sc = new Scanner(System.in);
	public static void FindAllBooks() {
		try(BookDao bookdao=new BookDao()){
			List<Book> list=bookdao.findall();
			for(Book book:list) {
				System.out.println(book.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void FindBYId() {
		try(BookDao bookdao =new BookDao()){
			System.out.println("Enter Book id :");
			int id=sc.nextInt();
			Book b=bookdao.findbyId(id);
			if(b==null) {
				System.out.println("Book not found");
			}else {
				System.out.println(b.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void saveBooks() {
		try(BookDao bookdao=new BookDao()){
			System.out.print("enter id: ");
			int id = sc.nextInt();
			System.out.print("enter name: ");
			String name = sc.next();
			System.out.print("enter author: ");
			String author = sc.next();
			System.out.print("enter subject: ");
			String subject = sc.next();
			System.out.print("enter price: ");
			double price = sc.nextDouble();
			Book b=new Book(id,name,author,subject,price);
			int count=bookdao.save(b);
			System.out.println("Book saved :"+count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void UpdateBook() {
		try(BookDao bookdao=new BookDao()){
			System.out.print("enter book id to update: ");
			int id = sc.nextInt();
			System.out.print("enter new name: ");
			String name = sc.next();
			System.out.print("enter new author: ");
			String author = sc.next();
			System.out.print("enter new subject: ");
			String subject = sc.next();
			System.out.print("enter new price: ");
			double price = sc.nextDouble();
			Book b = new Book(id, name, author, subject, price);
			int count = bookdao.update(b);
			System.out.println("Books Updated: " + count);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.print("\n0. Exit\n1. Find Book\n2. Show All Books\n3. Add Book\n4. Update Book\n5. Delete Book\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				FindBYId();
				break;
			case 2:
				FindAllBooks();
				break;
			case 3:
				saveBooks();
				break;
			case 4:
				UpdateBook();
				break;
			}
			

	}while(choice!=0);
	}
}
