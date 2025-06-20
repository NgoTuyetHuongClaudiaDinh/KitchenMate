package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Recipe;

@Repository
public interface RecipeRepository extends  CrudRepository<Recipe, Long> {

}