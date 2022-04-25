package com.example.lab2.service;

import com.example.lab2.model.Author;
import com.example.lab2.model.Book;
import com.example.lab2.model.BookCategory;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, BookCategory category, Author author, Integer availableCopies);

    Optional<Book> edit(Long id,BookCategory category, Author author, Integer availableCopies);


    void deleteById(Long id);
}
