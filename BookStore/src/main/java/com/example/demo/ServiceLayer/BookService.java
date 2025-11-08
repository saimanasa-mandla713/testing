package com.example.demo.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.repositoryLayer.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> searchBooks(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
