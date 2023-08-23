package com.training.prodsvc;

import java.util.Set;

public interface ProductDao {
	void addProduct(Product p);
	Product[] display();
	void updateProduct(Product p);
	void deleteProduct(Product p);

}
