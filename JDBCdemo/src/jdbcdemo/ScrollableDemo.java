package jdbcdemo;

import java.sql.*;
public class ScrollableDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","satyam2403");
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			rs=stmt.executeQuery("select*from skills");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			
			System.out.println("********** Display Recors from bottom to top********");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			System.out.println("********** Display 3rd row*******");
			
			rs.absolute(3); //move the cursor to 3rd record
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println("*******************************************");
			
			
           System.out.println("********** Display 2nd row using relative*******");
			rs.relative(2); //move the cursor to 2nd record using relative
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println("*******************************************");
			
			

	           System.out.println("********** Display 1st row using relative*******");
				rs.first(); //move the cursor to 1st 
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				System.out.println("*******************************************");
				
				rs.absolute(4);
				System.out.println("Current Cursor Position : "+rs.getRow());
				//System.out.println("Total no.of Recors: "+);
				
				rs.last();
				System.out.println("Total no.of Records: "+rs.getRow());
			
			con.close();
		}
		catch(Exception e) {
			
			  System.out.println(e);
		}
			

	}

}
