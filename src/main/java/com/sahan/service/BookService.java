package com.sahan.service;

import com.sahan.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sahan on 7/8/2016.
 */
@Service
public interface BookService {
    Book save(Book book);

    List<Book> viewAllBooks();

    Book getBooksById(int id);

    Book updateBook(Book student);

    Book deleteBook(Book book);
}
