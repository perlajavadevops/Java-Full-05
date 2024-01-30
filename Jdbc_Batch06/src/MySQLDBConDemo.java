import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDBConDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step 1
		//Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");// connection

		// step 3
		// Statement stmt = con.createStatement();
		// ResultSet rs = stmt.executeQuery("select * from emp");
		// ResultSet rs = stmt.executeQuery("select * from emp where empno=106");

		PreparedStatement preStmt = con.prepareStatement("select * from emp where empno = ? ");
		preStmt.setInt(1, 106);
		// step 4
		ResultSet rs = preStmt.executeQuery();
		while (rs.next()) {

			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getFloat("salary"));

			/*
			 * System.out.println(rs.getInt(1)); System.out.println(rs.getString(2));
			 * System.out.println(rs.getFloat(3));
			 */

		}
		
		// step 5
		con.close();

	}
}
