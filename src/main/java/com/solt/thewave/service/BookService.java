package com.solt.thewave.service;

import com.solt.thewave.entities.Book;
import com.solt.thewave.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    public void save(Book book){
        bookRepository.save(book);
    }
    public void delete(Book book){
        bookRepository.delete(book);
    }
    public Book findById(Integer id){
        return bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("INVALID ID "+id));
    }

}
