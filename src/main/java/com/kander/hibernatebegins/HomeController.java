package com.kander.hibernatebegins;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(Model model, HttpServletRequest request) {

		Book newBook = new Book();
		newBook.setTitle(request.getParameter("title"));
		newBook.setAuthor(request.getParameter("author"));
		newBook.setSales(Integer.parseInt(request.getParameter("sales")));
		newBook.setPublisher(request.getParameter("publisher"));

		DAO.addBookToLibrary(newBook);

		model.addAttribute("bookTitle", request.getParameter("title"));
		model.addAttribute("bookAuthor", request.getParameter("author"));
		model.addAttribute("bookSales", request.getParameter("sales"));
		// model.addAttribute("bookImprint", request.getParameter("imprint"));
		model.addAttribute("bookPublisher", request.getParameter("publisher"));
		/*
		 * model.addAttribute("bookYearPublished",
		 * request.getParameter("yearPublished"));
		 * model.addAttribute("bookGenre", request.getParameter("genre"));
		 * model.addAttribute("bookStatus", request.getParameter("status"));
		 * model.addAttribute("bookBorrower", request.getParameter("borrower"));
		 */
		return "bookAdded";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {

		// get the list of books from DAO
		List<Book> books = DAO.getAllBooks();

		// add this list to the model
		model.addAttribute("bookList", books);
		return "list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Model model, @RequestParam(value = "rank") int rank) {

		DAO.deleteBook(rank);
		// get the list of books from DAO
		List<Book> books = DAO.getAllBooks();

		// add this list to the model
		model.addAttribute("bookList", books);
		return "list";
	}

}
