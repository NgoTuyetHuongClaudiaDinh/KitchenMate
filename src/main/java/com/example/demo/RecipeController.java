package com.example.demo;

 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 public class RecipeController {
 
     @GetMapping("/Recipe")
     public Recipe testRoute() {
         return new Recipe ("Pasta", "Delicious pasta with tomato sauce", "Boil water, cook pasta, add sauce", "Easy");
     }
 }