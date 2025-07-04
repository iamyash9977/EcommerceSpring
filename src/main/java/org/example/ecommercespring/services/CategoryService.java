package org.example.ecommercespring.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryService {

    @GetMapping
    public String getCategory(){
        return "Hello Peers!";
    }

    @PostMapping
    public String postCategory(){
        return "Post Electronics";
    }

    @GetMapping("/count")
    public int getCategoryCount(){
        return 5;
    }
}
