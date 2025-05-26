package com.cdac.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="product_details")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	@Column( length = 30,name="product_name")
	private String productName;
	@Column( length = 30,name="product_description")
	private String productDescription;
	@Column( name="manufacture_date")
	private LocalDate manufactureDate;
	private Double price;
	
	private Integer quantity;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product() {
		
	}
	
	public Product(Long productId, String productName, Double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public Product(String productName, String productDescription, LocalDate manufactureDate, Double price,
			Integer quantity) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.manufactureDate = manufactureDate;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDescription=" + productDescription
				+ ", manufactureDate=" + manufactureDate + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
