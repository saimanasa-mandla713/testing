package com.example.demo.repositoryLayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByCategory(String category);
}
