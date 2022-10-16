package sillashead.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sillashead.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
