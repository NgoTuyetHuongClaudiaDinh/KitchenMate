package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    List<Integer> ingredients = new ArrayList<>();
    private String instructions;
    private String difficultyLevel;
    private String[] steps;

    public Recipe(String name, String description, String instructions, String difficultyLevel, String[] steps) {
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.difficultyLevel = difficultyLevel;
        this.steps = steps;
    }

    public Recipe() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIngredients(List<Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Integer> getIngredients() {
        return ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void addIngredient(int ingredientId) {
        ingredients.add(ingredientId);
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
