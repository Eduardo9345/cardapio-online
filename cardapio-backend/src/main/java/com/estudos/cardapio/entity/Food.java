package com.estudos.cardapio.entity;

import com.estudos.cardapio.controller.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "foods")
@Table(name = "foods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    public Food(FoodRequestDTO data){
        this.setTitle(data.title());
        this.setImage(data.image());
        this.setPrice(data.price());
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String image;

    private Integer price;

}
