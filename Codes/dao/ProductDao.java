package com.cdac.dao;
import java.time.LocalDate;
import java.util.List;

import com.cdac.entities.*;
public interface ProductDao {
	String addProduct(Product p);

	List<Product> displayProduct();

	Product getProductDetailsById(long nextLong);

	List<Product> getProductIdNamePriceByDate(LocalDate date);
}
