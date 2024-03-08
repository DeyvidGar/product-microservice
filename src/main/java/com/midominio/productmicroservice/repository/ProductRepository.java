package com.midominio.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.midominio.productmicroservice.entity.Product;

/**
 * Interface to obtains values of Mongo database.
 * 
 * @author David G.
 * @version 1.0
 */
public interface ProductRepository extends MongoRepository<Product, String>{

}
