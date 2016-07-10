package com.sahan.repo;

import com.sahan.model.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sahan on 7/8/2016.
 */
@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private BaseRepository baseRepository;

    public Book saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        return book;
    }

    public List<Book> viewAllBooks() {
        List<Book> books = baseRepository.viewAllBooks(Book.class);
        return books;
    }

    public Book getBooksById(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        criteria.add(Restrictions.eq("id", id));
        Book book = (Book) criteria.uniqueResult();
        session.close();
        return book;
    }

    public Book updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(book);
        session.getTransaction().commit();
        return book;
    }

    public Book deleteBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(book);
        session.getTransaction().commit();
        return book;
    }
}
