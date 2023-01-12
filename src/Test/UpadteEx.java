package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadteEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Sowmya@123");
		
		Statement stm = con.createStatement();
		
		stm.executeUpdate("update eproduct set price = 3000.00 where name = 'Tablet'");

		ResultSet result = stm.executeQuery("select * from eproduct");
		
		while(result.next()) {
			
			System.out.print(result.getInt("ID") +"\t");
			System.out.print(result.getString("name") +"\t");
			System.out.print(result.getBigDecimal("Price") +"\t");
			
	
		}

	}

}
