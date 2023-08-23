package com.training.prodsvc;

import java.util.List;

public class ProductWsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductServiceImplService obj =new ProductServiceImplService();
		ProductServiceImpl prod = obj.getProductServiceImpl();
		
		//Product[] k =prod.getProdInfo()
		List<Product> prodList = prod.getProdInfo();
		for(Product prp:prodList) {
			System.out.println(prp.getProdId()+prp.getProdName());
		}
		Product p1=new Product();
		p1.setProdId("101");
		p1.setProdName("Kundan");
		prod.updateProduct(p1);
		
		//System.out.println(prod.getProdInfo());
		
	}

}
