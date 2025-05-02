package com.estudos.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.cardapio.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}
