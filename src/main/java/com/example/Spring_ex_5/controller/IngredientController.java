package com.example.Spring_ex_5.controller;

import com.example.Spring_ex_5.dto.*;
import com.example.Spring_ex_5.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;
    @PostMapping("ingredient/post")
    public CreateResponseDto createIngredient (@RequestBody CreateRequestDto requestDTO) {
        return ingredientService.createIngredient(requestDTO);
    }
    @GetMapping("ingredient/get")
    public GetResponseDto getIngredient (@RequestParam Long id) {
        return  ingredientService.getIngredient(id);
    }
    @PutMapping ("ingredient/put")
    public BaseResponse updateIngredient (@RequestBody UpdateRequestDto requestDTO) {
        return ingredientService.updateIngredient(requestDTO);
    }
    @DeleteMapping ("ingredient/delete")
    public BaseResponse deleteIngredient (@RequestBody DeleteRequestDto requestDTO) {
        return ingredientService.deleteIngredient(requestDTO);
    }
}
