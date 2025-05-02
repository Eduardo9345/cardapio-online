package com.estudos.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.cardapio.controller.FoodRequestDTO;
import com.estudos.cardapio.entity.FoodDTO;
import com.estudos.cardapio.repository.FoodRepository;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<FoodDTO> getAll(){
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new).toList();
        return foodList;
    }

    public void save(FoodRequestDTO food){
        foodRepository.save(FoodRequestDTO.toEntity(food));
    }
}
