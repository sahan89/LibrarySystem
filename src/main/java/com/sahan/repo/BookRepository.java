package com.sahan.repo;

import com.sahan.model.Book;

import java.util.List;

/**
 * Created by sahan on 7/8/2016.
 */
public interface BookRepository {
    Book saveBook(Book book);

    List<Book> viewAllBooks();

    Book getBooksById(int id);

    Book updateBook(Book student);

    Book deleteBook(Book book);
}
