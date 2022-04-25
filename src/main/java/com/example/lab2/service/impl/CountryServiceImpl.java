package com.example.lab2.service.impl;

import com.example.lab2.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl  implements CountryService {
    @Override
    public List<CountryService> findAll() {
        return null;
    }

    @Override
    public Optional<CountryService> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<CountryService> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<CountryService> save(String name, String continent) {
        return Optional.empty();
    }

    @Override
    public Optional<CountryService> edit(Long id, String name, String continent) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
