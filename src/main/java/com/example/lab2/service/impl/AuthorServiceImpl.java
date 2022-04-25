package com.example.lab2.service.impl;

import com.example.lab2.model.Author;
import com.example.lab2.service.AuthorService;
import com.example.lab2.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> save(String name, String surname, CountryService country) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> edit(Long id, String name, String surname, CountryService country) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
