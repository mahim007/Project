package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeMap;

import javax.imageio.stream.FileImageInputStream;

public class BookDAO {
	TreeMap<String, Book> books=new TreeMap<>();

	public BookDAO()
	{
		File f=new File("rifat.dat");
		if(!f.exists()){
			//first time
			try {
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(books);
				oos.flush();
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		else
		{
			//file already exists
			try {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
				books= (TreeMap<String, Book>) ois.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void addBook(Book book)
	{
		books.put(book.getBookId(), book);
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("rifat.dat"));
			oos.writeObject(books);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	public Set<String> getBookIds()
	{
		return books.keySet();
	}
	public Book getBookById(String bookId)
	{
		return books.get(bookId);
	}
	public static void main(String[] args) {
		//System.out.println("Hello world");
		BookDAO bdao=new BookDAO();
		Book book=new Book();
		book.setBookId("ISBN00003");
		book.setTitle("3 Idiots");
		book.setAuthor("Chetan Baghat");
		book.setPrice(202.00f);
		bdao.addBook(book);
		
		/*Book bk=bdao.getBookById("ISBN00002");
		if(bk!=null)
			System.out.println(bk.toString());*/
		Set<String> ids= bdao.getBookIds();
		for(String id : ids)
		{
			System.out.println(id);
		}
		System.out.println("done");
	}

}
