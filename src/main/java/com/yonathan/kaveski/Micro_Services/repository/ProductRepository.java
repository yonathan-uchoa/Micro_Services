package com.yonathan.kaveski.Micro_Services.repository;

import com.yonathan.kaveski.Micro_Services.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Iterable<Product> findByName(String name);
}
