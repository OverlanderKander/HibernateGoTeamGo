package com.kander.hibernatebegins;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
	
	public static int deleteBookFromLibrary(Book b) {
		if (factory == null)
			setupFactory();
		Session hibernateSession = factory.openSession();
		hibernateSession.getTransaction().begin();
		int i = (Integer) hibernateSession.save(b);
		hibernateSession.getTransaction().commit();
		hibernateSession.close();
		return i;
	}
	
	
		
		
//		String addANewBook = "INSERT INTO Library(bookTitle, bookAuthor, bookSales, bookImprint, bookPublisher, bookYearPublished, bookGenre, bookStatus, bookBorrower)";

		// + " SELECT * FROM Library";
//		Query query = hibernateSession.createQuery(addANewBook);
//		int result = query.executeUpdate();
//		System.out.println("Rows affected: " + result);

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
}