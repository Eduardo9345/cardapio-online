package com.estudos.cardapio.controller;

import com.estudos.cardapio.entity.Food;

public record FoodRequestDTO(String title, String image, Integer price)  {

    public static Food toEntity(FoodRequestDTO food) {
        Food newFood = new Food(food);
        return newFood;
    }

}
