package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Recipe;
import com.example.demo.repository.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    public List<Recipe> getAll() {
        List<Recipe> recipes = new java.util.ArrayList<>();
        repository.findAll().forEach(recipes::add);
        return recipes;
    }

    public Recipe get(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Recipe save(Recipe recipe) {
        return repository.save(recipe);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
