package com.gabriel.menu_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.menu_api.service.FoodService;
import com.gabriel.menu_api.dto.FoodDTO;

@RestController 
@RequestMapping ("foods")
public class FoodController {
    
    private final FoodService foodService;

    FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping 
    public List<FoodDTO> getFoods() {
        List<FoodDTO> foods = foodService.getAll();

        return foods;
    }

    @GetMapping("/{id}")
    public FoodDTO findById(@PathVariable Long id) {
        return foodService.findById(id);
    }

    @PostMapping 
    public FoodDTO createFood(@RequestBody FoodDTO foodDTO) {
        return foodService.save(foodDTO);
    }

    @DeleteMapping("/{id}")
    public FoodDTO delete(@PathVariable Long id) {
        return foodService.delete(id);
    }
}
