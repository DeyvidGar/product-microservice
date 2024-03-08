package com.midominio.productmicroservice.service;

import java.util.List;
import com.midominio.productmicroservice.entity.Product;

/**
 * Contract interface of Product.
 */
public interface ProductService {
	
	/**
	 * Obtain all products of product in the database.
	 * 
	 * @return {@code List<Product>} obtains all products.
	 */
	public List<Product> getAllProducts();
	
	/**
	 * Save a new product in the database.
	 * 
	 * @param product to save.
	 * @return new product saved.
	 */
	public Product saveProduct(Product product);
}
