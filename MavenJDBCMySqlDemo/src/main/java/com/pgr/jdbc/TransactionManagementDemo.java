package com.pgr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "password");
		// System.out.println(connection);
		con.setAutoCommit(false);

		System.out.println("auto commit flag : " + con.getAutoCommit());

		String updateQuery = "update emp set salary=? WHERE empno=?";

		PreparedStatement ps = con.prepareStatement(updateQuery);

		ps.setFloat(1, 4000);
		ps.setInt(2, 106);

		ps.executeUpdate();
		con.commit();
		con.close();
	}
}