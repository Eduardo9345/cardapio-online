package com.estudos.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.cardapio.entity.FoodDTO;
import com.estudos.cardapio.service.FoodService;

@RestController // é um controller
@RequestMapping("food") // Controla os endpoints de food
public class FoodController {

    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodDTO> getAll(){
        List<FoodDTO> foodList = foodService.getAll();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void post(@RequestBody FoodRequestDTO food){
        foodService.save(food);
    }
}
