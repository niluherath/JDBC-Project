import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseConnection {
		
	public static void main(String [] args) {
		
		Connection myConn = null;
		Statement sta = null;
		ResultSet set = null;
		String JDBC_DRIVER = null;
		
		try {
			
			JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "password");
			
			sta = myConn.createStatement();
		//	sta.executeQuery(sql)
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////

