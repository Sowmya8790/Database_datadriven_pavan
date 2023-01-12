package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practise {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("om.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Sowmya@123");
		
		Statement stm = con.createStatement();
		
		

	}

}
