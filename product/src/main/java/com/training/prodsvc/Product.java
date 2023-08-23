package com.training.prodsvc;

public class Product {
	private String prod_id;
	private String prod_name;
	public Product() {
		super();
	}
	public Product(String prod_id, String prod_name) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
	}
	public String getProd_id() {
		return prod_id;
	}
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + "]";
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	

}
