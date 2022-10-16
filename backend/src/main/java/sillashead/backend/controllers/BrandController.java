package sillashead.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sillashead.backend.entities.Brand;
import sillashead.backend.services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {
    
    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> findAll() {
        return ResponseEntity.ok(brandService.findAll());
    }
}
