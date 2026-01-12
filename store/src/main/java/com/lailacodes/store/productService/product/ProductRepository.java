package com.lailacodes.store.productService.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public interface ProductRepository extends MongoRepository<ProductView, String> {
    public String findAllById(String id);
    public boolean existsById(String id);
    public long count();
    public int getQuantityById(String id);
    public BigDecimal getPriceById(String id);
    public List<ProductView> findAll();
}
