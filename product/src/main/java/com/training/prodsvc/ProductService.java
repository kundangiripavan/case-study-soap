package com.training.prodsvc;

import java.util.Set;

public interface ProductService {
    Product[] getProdInfo() ;
	void addProduct(Product p);
	void updateProduct(Product P);
	void deleteProduct(Product p);

}
