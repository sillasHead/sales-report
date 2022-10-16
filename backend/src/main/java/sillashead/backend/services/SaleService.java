package sillashead.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sillashead.backend.entities.Sale;
import sillashead.backend.repositories.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).get();
    }

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }
}
