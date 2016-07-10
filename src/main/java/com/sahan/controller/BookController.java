package com.sahan.controller;

import com.sahan.model.Book;
import com.sahan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by sahan on 7/8/2016.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/createBook", method = RequestMethod.POST)
    public String saveBooks(@Valid @ModelAttribute("saveBooks") Book book, BindingResult bindingResult) {
        System.out.println("Create Books Post----->>>");
        System.out.println("-->> " + book.getTitle());
        if (bindingResult.hasErrors()) {
            return "error";
        } else {
            bookService.save(book);
            return "redirect:/viewBooks.html";
        }
    }


    @RequestMapping(value = "/createBook", method = RequestMethod.GET)
    public ModelAndView createBooks(Model model) {
        System.out.println("Create Books Get-->>>");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("createBook");
        return modelAndView;
    }


    @RequestMapping(value = "/viewBooks", method = RequestMethod.GET)
    public ModelAndView viewStudents(Model model) {
        System.out.println("View Books-->>>");
        ModelAndView modelAndView = new ModelAndView();
        List<Book> books = bookService.viewAllBooks();
        modelAndView.setViewName("viewBooks");
        modelAndView.addObject("booksList", books);
        return modelAndView;
    }


    @RequestMapping(value = "/updateBooks", method = RequestMethod.GET)
    public ModelAndView updateBooks(@RequestParam Integer id) {
        System.out.println("updateBooks GET ------->>>");
        ModelAndView modelAndView = new ModelAndView("updateBooks");
        Book book = bookService.getBooksById(id);
        modelAndView.addObject("updateBook", book);
        return modelAndView;
    }

    @RequestMapping(value = "/updateBooks", method = RequestMethod.POST)
    public String update(@Valid @ModelAttribute("updateBook") Book book, BindingResult bindingResult) {
        System.out.println("updateBook POST ------->>>");
        if (bindingResult.hasErrors()) {
            return "error";
        } else {
            bookService.updateBook(book);
            return "redirect:/viewBooks.html";
        }
    }

    @RequestMapping(value = "/deleteBooks.html", method = RequestMethod.GET)
    public ModelAndView deleteStudent(@RequestParam Integer id) {
        System.out.println("DeleteBooks GET ------->>>");
        ModelAndView modelAndView = new ModelAndView("deleteBooks");
        Book book = bookService.getBooksById(id);
        modelAndView.addObject("deleteBook", book);
        return modelAndView;
    }


    @RequestMapping(value = "/deleteBooks.html", method = RequestMethod.POST)
    public String deleteStudent(@Valid @ModelAttribute("deleteBook") Book book, BindingResult bindingResult) {
        System.out.println("DeleteBook POST ------->>>");
        if (bindingResult.hasErrors()) {
            return "error";
        } else {
            bookService.deleteBook(book);
            return "redirect:/viewBooks.html";
        }
    }
}
