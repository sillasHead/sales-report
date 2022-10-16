package sillashead.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sillashead.backend.entities.ProductSale;

public interface ProductSaleRepository extends JpaRepository<ProductSale, Long> {
    
}
