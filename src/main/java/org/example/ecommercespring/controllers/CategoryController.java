package org.example.ecommercespring.controllers;

import com.fasterxml.jackson.core.format.InputAccessor;
import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }


    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {
        List<CategoryDTO> result = this.categoryService.getAllCategories();
        return ResponseEntity.ok(result);
    }



}
