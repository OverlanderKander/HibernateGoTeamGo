package com.kander.hibernatebegins;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.kander.hibernatebegins.Book;

public class DAO {

	private static SessionFactory factory;

	private static void setupFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			;
		}
		Configuration configuration = new Configuration();

		// modify these to match your XML files
		configuration.configure("hibernate.cfg.xml");
		configuration.addResource("book.hbm.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		factory = configuration.buildSessionFactory(serviceRegistry);
	}

	public static int addBookToLibrary(Book b) {
		if (factory == null)
			setupFactory();
		Session hibernateSession = factory.openSession();
		hibernateSession.getTransaction().begin();
		int i = (Integer) hibernateSession.save(b);
		hibernateSession.getTransaction().commit();
		hibernateSession.close();
		return i;
	}

	/*
	 * public void deleteBookFromLibrary(Book b) { if (factory == null)
	 * setupFactory(); Session hibernateSession = factory.openSession();
	 * 
	 * // Book b = (Book)hibernateSession.load(Book.class, b.getRank());
	 * System.out.println(b.getTitle()); System.out.println(b.getRank());
	 * hibernateSession.getTransaction().begin(); hibernateSession.delete(b);
	 * hibernateSession.getTransaction().commit(); hibernateSession.close(); }
	 */
	/*
	 * public void deleteBookFromLibrary(Integer rank) { Session
	 * hibernateSession = factory.openSession(); Transaction trans = null; try {
	 * trans = hibernateSession.beginTransaction(); Book littleBook =
	 * (Book)hibernateSession.get(Book.class, rank);
	 * hibernateSession.delete(littleBook); trans.commit(); }
	 * catch(HibernateException e) { if (trans !=null) { trans.rollback();
	 * e.printStackTrace(); } hibernateSession.close(); } }
	 */
	/*
	 * if (factory == null) setupFactory(); Session hibernateSession =
	 * factory.openSession(); hibernateSession.getTransaction().begin(); String
	 * testDelete = "DELETE FROM Library where Rank=?";
	 * hibernateSession.delete(rankInt);
	 * hibernateSession.getTransaction().commit(); // int result =
	 * hibernateSession System.out.println("Rows affected: " + result);
	 * hibernateSession.close(); }
	 * 
	 * // String addANewBook =
	 * "INSERT INTO Library(bookTitle, bookAuthor, bookSales, bookImprint, bookPublisher, bookYearPublished, bookGenre, bookStatus, bookBorrower)"
	 * ;
	 * 
	 * // Query query = hibernateSession.createQuery(addANewBook);
	 */

	public static List<Book> getAllBooks() {
		if (factory == null)
			setupFactory();
		Session hibernateSession = factory.openSession();
		hibernateSession.getTransaction().begin();
		List<Book> books = hibernateSession.createQuery("FROM Book").list();
		hibernateSession.getTransaction().commit();
		hibernateSession.close();
		return books;
	}

	public static Book deleteBook(Integer Rank) {
		if (factory == null)
			setupFactory();
		Session hibernateSession = factory.openSession();
		hibernateSession.getTransaction().begin();
		Book oldBook = (Book) hibernateSession.get(Book.class, Rank);
		hibernateSession.delete(oldBook);
		hibernateSession.getTransaction().commit();
		hibernateSession.close();
		return oldBook;
	}	

	
	
/*	
	
	
	public static Book deleteBook(Integer Rank) {
		Session hibernateSession = factory.openSession();
		Transaction trans = null;
		try {
			trans = hibernateSession.beginTransaction();
			Book book = (Book) hibernateSession.get(Book.class, Rank);
			hibernateSession.delete(book);
			trans.commit();
			return book;
		} catch (HibernateException e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			hibernateSession.close();

		}
	} */

}
