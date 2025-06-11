package com.example.demo.service;

import com.example.demo.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    public List<Recipe> getAll() {
        return repository.findAll();
    }

    public Optional<Recipe> getById(Long id) {
        return repository.findById(id);
    }

    public Recipe save(Recipe recipe) {
        return repository.save(recipe);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
