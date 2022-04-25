package com.example.lab2.service;

import com.example.lab2.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll();

    Optional<Author> findById(Long id);

    Optional<Author> findByName(String name);

    Optional<Author> save(String name, String surname, CountryService country);

    Optional<Author> edit(Long id, String name, String surname, CountryService country);


    void deleteById(Long id);

}
