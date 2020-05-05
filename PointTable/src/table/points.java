package table;

import java.sql.Connection;
import java.sql.DriverManager;

public class points {
	private Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ pointstable?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

 }
	
}