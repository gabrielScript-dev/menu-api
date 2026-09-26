package com.gabriel.menu_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gabriel.menu_api.dto.FoodDTO;
import com.gabriel.menu_api.model.Food;
import com.gabriel.menu_api.repository.FoodRepository;

@Service 
public class FoodService {
    
    private final FoodRepository foodRepository;

    FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<FoodDTO> getAll() {
        List<Food> foodList = foodRepository.findAll();

        return foodList
            .stream()
            .map(FoodDTO::convert)
            .toList();
    }

    public FoodDTO findById(long foodId) {
        Optional<Food> food = foodRepository.findById(foodId);

        if(food.isPresent()) {
            return FoodDTO.convert(food.get());
        }

        return null;
    }

    public FoodDTO save(FoodDTO foodDTO) {
        Food food = foodRepository.save(Food.convert(foodDTO));

        return FoodDTO.convert(food);
    }

    public FoodDTO delete(long foodId) {
        Optional<Food> food = foodRepository.findById(foodId);

        if(food.isPresent()) {
            foodRepository.delete(food.get());
        }

        return null;
    }
}
