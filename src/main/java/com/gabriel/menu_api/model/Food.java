package com.gabriel.menu_api.model;

import com.gabriel.menu_api.dto.FoodDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Table (name = "foods")
@Entity (name = "foods")
public class Food {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;

    public static Food convert(FoodDTO foodDTO) {
        Food food = new Food();

        food.setId(foodDTO.getId());
        food.setTitle(foodDTO.getTitle());
        food.setDescription(foodDTO.getDescription());
        food.setPrice(foodDTO.getPrice());

        return food;
    }
}
