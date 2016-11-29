package com.kander.hibernatebegins;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
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
		//model.addAttribute("bookImprint", request.getParameter("imprint"));
		model.addAttribute("bookPublisher", request.getParameter("publisher"));
		/*model.addAttribute("bookYearPublished", request.getParameter("yearPublished"));
		model.addAttribute("bookGenre", request.getParameter("genre"));
		model.addAttribute("bookStatus", request.getParameter("status"));
		model.addAttribute("bookBorrower", request.getParameter("borrower"));*/
		return "home";
	}

}
