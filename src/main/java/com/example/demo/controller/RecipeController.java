package com.example.demo.controller;

import com.example.demo.Recipe;
import com.example.demo.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
@CrossOrigin(origins = {"http://localhost:5173", "https://kitchenmate-frontend.onrender.com"})
public class RecipeController {

    @Autowired
    RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return service.getAll();
    }

    @PostMapping
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }
}
