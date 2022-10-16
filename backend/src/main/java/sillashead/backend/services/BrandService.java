package sillashead.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sillashead.backend.entities.Brand;
import sillashead.backend.repositories.BrandRepository;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand findById(Long id) {
        return brandRepository.findById(id).get();
    }

    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    public void deleteById(Long id) {
        brandRepository.deleteById(id);
    }
}
