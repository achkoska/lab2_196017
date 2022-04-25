package com.example.lab2.service.impl;

import com.example.lab2.model.Author;
import com.example.lab2.model.Book;
import com.example.lab2.model.BookCategory;
import com.example.lab2.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> save(String name, BookCategory category, Author author, Integer availableCopies) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Long id, BookCategory category, Author author, Integer availableCopies) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
