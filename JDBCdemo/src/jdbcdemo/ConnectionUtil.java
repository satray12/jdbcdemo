package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public static Connection createConnection( ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","satyam2403");

		return con;
		

	}

}
