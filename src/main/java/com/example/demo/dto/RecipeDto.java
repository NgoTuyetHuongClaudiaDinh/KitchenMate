package com.example.demo.dto;

public class RecipeDto {
    private Integer id;
    private String name;
    private String difficultyLevel;
    private String category;
    private String description;
    private String link;
    private String[] steps;

    public RecipeDto(Integer id,
                     String name,
                     String difficultyLevel,
                     String category,
                     String description,
                     String link,
                     String[] steps) {
        this.id = id;
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.category = category;
        this.description = description;
        this.link = link;
        this.steps = steps;
    }

    public RecipeDto() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDifficultyLevel() { return difficultyLevel; }
    public void setDifficultyLevel(String difficultyLevel) { this.difficultyLevel = difficultyLevel; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }

    public String[] getSteps() { return steps; }
    public void setSteps(String[] steps) { this.steps = steps; }
}
