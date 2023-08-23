package com.training.prodsvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void addProduct(Product p) {
		System.out.println("Inside Product DAO:::");
		// TODO Auto-generated method stub
		try{Connection conn = Dbcon.getconnection();
				String Query = "insert into product1 values (?, ?)";
				PreparedStatement ps =conn.prepareStatement(Query);
				ps.setString(1, p.getProd_id());
				ps.setString(2, p.getProd_name());
				ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Product[] display() {
		// TODO Auto-generated method stub
		Product[] k = new Product[20];
		try {Connection conn = Dbcon.getconnection();
		Statement stmt = conn.createStatement();
		
		ResultSet rs =stmt.executeQuery("select * from product1");
		
		int i=-1;
		while(rs.next()) {
			i=i+1;
			System.out.println(rs.getString(1)+"     "+rs.getString(2)+"     ");
			
			Product p =new Product(rs.getString(1),rs.getString(2));
			k[i]=p;
			
		
		}
		return k;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			
		
		return null;
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		System.out.println("Inside update DAO:::");
		// TODO Auto-generated method stub
		try{Connection conn = Dbcon.getconnection();
		PreparedStatement stmt = conn.prepareStatement("select * from product1 where prod_id=?");
		stmt.setString(1, p.getProd_id());
		
		ResultSet rs =stmt.executeQuery();
		if(rs.next()) {
			PreparedStatement upst = conn.prepareStatement("update product1 set PROD_NAME=? where PROD_ID =?");
			upst.setString(1, p.getProd_name());
			upst.setString(2, p.getProd_id());
			upst.executeUpdate();
			System.out.println("updated");
			
		}
		else {
			System.out.println("the product does not exist");
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	
		
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		System.out.println("Inside delete DAO:::");
		// TODO Auto-generated method stub
		try{Connection conn = Dbcon.getconnection();
		PreparedStatement stmt = conn.prepareStatement("delete  from product1 where prod_id=?");
		stmt.setString(1, p.getProd_id());
		stmt.executeUpdate();
		
	}
		catch(SQLException e) {
			e.printStackTrace();
		}

}}
