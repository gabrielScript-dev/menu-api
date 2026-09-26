package com.gabriel.menu_api.dto;

import com.gabriel.menu_api.model.Food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class FoodDTO {

    private Long id;
    private String title;
    private String description;
    private Double price;


    public static FoodDTO convert(Food food) {
        FoodDTO foodDTO = new FoodDTO();

        foodDTO.setId(food.getId());
        foodDTO.setTitle(food.getTitle());
        foodDTO.setDescription(food.getDescription());
        foodDTO.setPrice(food.getPrice());

        return foodDTO;
    }
}
