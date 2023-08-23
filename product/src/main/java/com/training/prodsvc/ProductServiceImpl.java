package com.training.prodsvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductServiceImpl implements ProductService{
	//List<Product> prodList = new ArrayList<>();
	ProductDao dao = new ProductDaoImpl();
	@Override
	public Product[] getProdInfo() {
		// TODO Auto-generated method stub
		Product[] result=dao.display();
		return result;
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		//prodList.add(p);
		dao.addProduct(p);
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		dao.updateProduct(p);
		
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		dao.deleteProduct(p);
		
	}

}
