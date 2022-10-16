package sillashead.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sillashead.backend.entities.ProductSale;
import sillashead.backend.repositories.ProductSaleRepository;

@Service
public class ProductSaleService {

    @Autowired
    private ProductSaleRepository productsaleRepository;

    public List<ProductSale> findAll() {
        return productsaleRepository.findAll();
    }

    public ProductSale getProductSaleById(Long id) {
        return productsaleRepository.findById(id).get();
    }

    public ProductSale save(ProductSale productsale) {
        return productsaleRepository.save(productsale);
    }

    public void deleteById(Long id) {
        productsaleRepository.deleteById(id);
    }
}
