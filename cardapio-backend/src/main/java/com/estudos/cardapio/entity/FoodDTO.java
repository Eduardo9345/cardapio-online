package com.estudos.cardapio.entity;

public record FoodDTO(Long id, String title, String image, Integer price) {

    public FoodDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
