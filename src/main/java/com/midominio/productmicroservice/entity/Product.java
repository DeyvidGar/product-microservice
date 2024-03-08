package com.midominio.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity class that represent object model in the database.
 * 
 * @author David G.
 * @version 1.0
 */
@Document(value = "product")
@Getter
@Setter
public class Product {
	
	/**
	 * Product id.
	 */
	@Id
	private String id;
	
	/**
	 * Product name.
	 */
	private String name;
	
	/**
	 * Product description.
	 */
	private String description;
	
	/**
	 * Product price.
	 */
	private Double price;
	
}
