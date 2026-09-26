package com.gabriel.menu_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.menu_api.model.Food;


public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
