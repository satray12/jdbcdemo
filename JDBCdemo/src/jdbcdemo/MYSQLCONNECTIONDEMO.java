package jdbcdemo;

import java.sql.*;

public class MYSQLCONNECTIONDEMO {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		//load & register the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection getConnection() of DMclass
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","satyam2403");
			
		//create statement object
			stmt=con.createStatement();
			
			//execute a query & store in resultSet
			rs=stmt.executeQuery("Select*from employees");
			
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" " +rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
		}
		
		
		//System.out.println("Display specific record from a db");
		//rs.absolute(3);
		//System.out.println(rs.getInt(1)+" " +rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
		
		con.close();
		}
	
		catch(Exception e) {
			e.printStackTrace();
		}
						
	}



	}


