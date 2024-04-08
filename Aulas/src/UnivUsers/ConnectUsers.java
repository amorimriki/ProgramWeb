package UnivUsers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUsers {
	public static void main(String args[]) {
		try {
			String url = "jdbc:mysql://localhost:3306/testedb";
			String username = "root";
			String password = "ricardoamorim1210#";
			Connection conn = DriverManager.getConnection(url,username, password);
			System.out.println("Connected whith the data base successfully");
			
			
			
			
			
			
			
			conn.close();
			
		} catch (SQLException e) {e.printStackTrace();System.out.println("Not Connected");}
	}
}
