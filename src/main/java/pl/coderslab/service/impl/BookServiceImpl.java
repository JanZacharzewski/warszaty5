package pl.coderslab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.domain.Book;
import pl.coderslab.repository.BookDao;
import pl.coderslab.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookDao dao;

    @Autowired
    public BookServiceImpl(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Book> findAll() {
        return dao.getList();
    }

    @Override
    public Book findById(long id) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }
}
