package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		//database name = ecommerce , table name = eproduct
		
		Statement stm = con.createStatement();
		//Statement object to save the output from the query once executed
		//we cannot execute any query without Statement object
		
		//stm.executeUpdate("insert into eproduct (ID,name, price, date_added) values (2,'Ear phone', 500.00, now())");
		//stm.executeUpdate("Update eproduct SET name = 'Headset' where ID = 2");
		stm.executeUpdate("Delete From eproduct where ID = 2");
		//Insert query
		//executeUpdate method returns only integer, so cannot store in the ResultSet object
		
		ResultSet result = stm.executeQuery("select * from eproduct");
		//Resultset is a SET to save the data retrieved from database
		
		ResultSet result1 = stm.executeQuery("select count(*) from eproduct");
		
		while(result.next()) {
			
			System.out.println(result.getInt("ID") + " - " + result.getString("name"));
			
		}
		con.close();

	}

}
