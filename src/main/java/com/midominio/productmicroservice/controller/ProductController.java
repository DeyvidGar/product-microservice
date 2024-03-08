package com.midominio.productmicroservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.midominio.productmicroservice.entity.Product;
import com.midominio.productmicroservice.service.ProductService;

/**
 * Class controller for rest apis to product.
 */
@RestController
@RequestMapping("/api")
public class ProductController {
	
	/**
	 * Product service layer.
	 */
	private ProductService productService;
	
	/**
	 * Constructor to inject dependencies.
	 * 
	 * @param productService business logic for product.
	 */
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * End-point to get all products.
	 * 
	 * @return {@code List<Product>} all products in the database.
	 */
	@GetMapping("/products")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	
	/**
	 * End-point to save a product.
	 * 
	 * @return {@code Product} that represent persistence entity.
	 */
	@PostMapping("/product")
	@ResponseStatus(HttpStatus.OK)
	public Product saveProduct(@RequestBody Product product) {
		return this.productService.saveProduct(product);
	}
	
}
