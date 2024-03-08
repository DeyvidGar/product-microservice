package com.midominio.productmicroservice.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.midominio.productmicroservice.entity.Product;
import com.midominio.productmicroservice.repository.ProductRepository;
import com.midominio.productmicroservice.service.ProductService;

/**
 * Service class that represent the business logic for product.
 * 
 * @author David G.
 * @version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	/**
	 * Repository to get data.
	 */
	private ProductRepository productRepository;
	
	/**
	 * Constructor that inject the dependencies.
	 * 
	 * @param productRepository product data.
	 */
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return {@code List<Product>} all products.
	 */
	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return {@code Product} saved.
	 */
	@Override
	public Product saveProduct(Product product) {
		return this.productRepository.save(product);
	}

}
