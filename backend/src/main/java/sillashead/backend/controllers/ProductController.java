package sillashead.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sillashead.backend.entities.Brand;
import sillashead.backend.entities.Category;
import sillashead.backend.entities.Product;
import sillashead.backend.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(@RequestParam(required = false) Brand brand,
            @RequestParam(required = false) Category category) {
        return ResponseEntity.ok(productService.findByBrandAndCategory(brand, category));
    }
}
