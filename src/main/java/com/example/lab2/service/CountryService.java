package com.example.lab2.service;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<CountryService> findAll();

    Optional<CountryService> findById(Long id);

    Optional<CountryService> findByName(String name);

    Optional<CountryService> save(String name, String continent);

    Optional<CountryService> edit(Long id, String name, String continent);


    void deleteById(Long id);

}
