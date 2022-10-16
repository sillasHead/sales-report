package sillashead.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sillashead.backend.entities.Brand;
import sillashead.backend.entities.Category;
import sillashead.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    public List<Product> findByBrandAndCategory(Brand brand, Category category);
}
