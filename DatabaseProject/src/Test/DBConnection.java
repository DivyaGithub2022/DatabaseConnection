package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//extend the Driver.class inside this class (DBConnection) for accessing 'DriverManager' in below statement
		//it is basically telling your class which Driver it should use 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		//creating Connection string 'con' here
		//database name = ecommerce , table name = eproduct
		
		Statement stm = con.createStatement();
		//Statement object to save the output from the query once executed
		//we cannot execute any query without Statement object
		
		ResultSet result = stm.executeQuery("select * from eproduct");
		//Resultset is a SET to save the data retrieved from database
		
		while(result.next()) {
			
			System.out.println(result.getInt("ID") + " - " + result.getString("name"));
			
		}
		con.close();
		

	}

}
