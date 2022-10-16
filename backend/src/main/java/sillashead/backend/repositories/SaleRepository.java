package sillashead.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sillashead.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
