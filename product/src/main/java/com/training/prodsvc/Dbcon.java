package com.training.prodsvc;
import java.sql.*;

public class Dbcon {

	
	static  String url="jdbc:oracle:thin:@localhost:1521/orcl.docker.internal";
	static String username="scott";
	static String password = "tiger";
	public static Connection getconnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(url,username,password);
	}
	

}
