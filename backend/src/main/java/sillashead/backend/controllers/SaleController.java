package sillashead.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sillashead.backend.entities.Sale;
import sillashead.backend.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
    
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> findAll() {
        return ResponseEntity.ok(saleService.findAll());
    }
}
