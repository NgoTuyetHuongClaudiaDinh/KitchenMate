package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Recipe;
import com.example.demo.service.RecipeService;

@RestController
public class RecipeController {

    @Autowired
    RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return service.getAll();
    }

    @GetMapping("/recipes/{id}")
    public Recipe getRecipe(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }
}
