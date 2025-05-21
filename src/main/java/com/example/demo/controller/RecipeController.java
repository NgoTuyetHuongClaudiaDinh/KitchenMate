package com.example.demo.controller;

import com.example.demo.dto.RecipeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecipeController {

    @GetMapping("/recipes")
    public List<RecipeDto> getAllRecipes() {
        return Arrays.asList(
            new RecipeDto(
                1,
                "Spaghetti Bolognese",
                "Easy",
                "Italian",
                "Creamy spaghetti with minced meat and tomato sauce.",
                "https://www.youtube.com/watch?v=vume4a9bf-A",
                new String[]{
                    "Sautee garlic and onion in a frying pan.",
                    "Add minced meat, celery and carrots",
                    "Add tomato sauce and let it simmer for 2-3 hours",
                    "Boil your spaghetti as instructed on the box",
                    "Combine pasta and sauce and enjoy!"
                }
            ),
            new RecipeDto(
                2,
                "Pad Thai",
                "Intermediate",
                "Asian",
                "Noodle stir-fry with a sweet-savoury-sour sauce scattered with crushed peanuts",
                null,
                new String[]{
                    "Cook noodles. After, rinse with cold water.",
                    "Make your sauce and set it aside.",
                    "Add a tablespoon of oil to your wok and add the shrimp, chicken or tofu, garlic and bell pepper",
                    "Scramble your eggs directly in the pan.",
                    "Add noodles, sauce, bean sprouts and peanuts to the wok",
                    "Garnish with green onion, peanuts and cilantro."
                }
            ),
            new RecipeDto(
                3,
                "Pizza",
                "Easy",
                "Italian",
                "Original neapolitan pepperoni pizza.",
                "https://www.youtube.com/watch?v=sv3TXMSv6Lw",
                new String[]{
                    "Prepare your dough and let it rise",
                    "Add your tomato sauce and mozzarella and bake",
                    "Add your salami or other toppings and bake again"
                }
            ),
            new RecipeDto(
                4,
                "Hummus bowl",
                "Easy",
                "Oriental",
                "Couscous bowl with falafel, veggies and homemade hummus.",
                null,
                new String[]{
                    "Prepare your couscous and set aside.",
                    "Chop your veggies of choice and add to the bowl",
                    "Fry your falafel and add your hummus on top."
                }
            )
        );
    }
}
