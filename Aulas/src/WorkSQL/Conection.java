package WorkSQL;
import java.sql.*;

public class Conection {
	public  static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/testedb";
			String username = "root";
			String password = "ricardoamorim1210#";
			
			Connection conn = DriverManager.getConnection(url,username, password);
			conn.close();
			System.out.println("Connected whith the data base successfully");
		} catch (SQLException e) {e.printStackTrace();}	
	}
}
