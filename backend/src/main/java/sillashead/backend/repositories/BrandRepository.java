package sillashead.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sillashead.backend.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    
}
