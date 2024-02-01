package com.pgr.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// mysql driver registration
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03", "root", "root");// connection
		con.setAutoCommit(false);
		String selectAllEmpProcedure = "{CALL SelectAllEmployees};";
		String selectSingleEmpProcedure = "{CALL SelectSingleEmployee(?)};";

		String insertProcedure = "{CALL InsertEmployee(?,?,?)};";
		String deleteProcedure = "{CALL deleteEmployee(?)};";
		String updateProcedure = "{CALL UpdateEmployee(?,?,?)};";

		CallableStatement callSt = con.prepareCall(deleteProcedure);
		callSt.setInt(1, 2);
		/*
		 * callSt.setInt(1, 102); callSt.setString(2, "eeee"); callSt.setFloat(3, 800);
		 */
		boolean i = callSt.execute();// inserted false
		System.out.println(i);
		if (i == false) {
			System.out.println("Inserted");
			con.commit();
		} else {
			System.out.println("Not Inserted");
		}

		/*
		 * ResultSet results = callSt.executeQuery(); while (results.next()) {
		 * System.out.println(results.getInt(1) + " : " + results.getString(2) + " : " +
		 * results.getFloat(3)); }
		 */

	}
}
