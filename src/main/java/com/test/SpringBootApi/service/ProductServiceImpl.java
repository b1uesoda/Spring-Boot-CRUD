package com.test.SpringBootApi.service;


import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        try {
            return productRepository
        }
    }

    @Override
    public Optional<Product> findById(Long id) {

    }

    @Override
    public Product update(Long id, Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
