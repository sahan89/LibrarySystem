package com.sahan.service;

import com.sahan.model.Book;
import com.sahan.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sahan on 7/8/2016.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.saveBook(book);
    }

    public List<Book> viewAllBooks() {
        return bookRepository.viewAllBooks();
    }

    public Book getBooksById(int id) {
        return bookRepository.getBooksById(id);
    }

    public Book updateBook(Book book) {
        return bookRepository.updateBook(book);
    }

    public Book deleteBook(Book book) {
        return bookRepository.deleteBook(book);
    }
}
