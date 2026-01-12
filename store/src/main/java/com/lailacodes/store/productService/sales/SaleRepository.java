package com.lailacodes.store.productService.sales;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories(basePackageClasses = SaleRepository.class)
public interface SaleRepository extends MongoRepository<Sale, String> {
}
