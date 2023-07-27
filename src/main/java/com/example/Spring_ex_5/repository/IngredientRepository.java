package com.example.Spring_ex_5.repository;

import com.example.Spring_ex_5.entity.Ingredient;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface IngredientRepository extends JpaRepository <Ingredient, Long> {
    Optional<Ingredient> findByName(String name);
}
