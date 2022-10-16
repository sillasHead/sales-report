package sillashead.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sillashead.backend.entities.Brand;
import sillashead.backend.entities.Category;
import sillashead.backend.entities.Product;
import sillashead.backend.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByBrandAndCategory(Brand brand, Category category) {
        return productRepository.findByBrandAndCategory(brand, category);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
