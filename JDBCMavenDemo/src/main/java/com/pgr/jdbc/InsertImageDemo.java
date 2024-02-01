package com.pgr.jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertImageDemo {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

		// load
		Class.forName("com.mysql.cj.jdbc.Driver");// mysql driver registration
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03", "root", "root");// connection

		/*
		 * PreparedStatement ps =
		 * con.prepareStatement("insert into imgtable values(?,?)"); ps.setString(1,
		 * "bangalore");
		 * 
		 * FileInputStream fin = new
		 * FileInputStream("F:\\Java Meterials\\test_image.jpg"); ps.setBinaryStream(2,
		 * fin, fin.available()); int i = ps.executeUpdate(); System.out.println(i +
		 * " records affected");
		 */

		// retriev image

		PreparedStatement ps = con.prepareStatement("select * from imgtable where name=?");
		ps.setString(1, "bangalore");

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {// now on 1st row

			Blob b = rs.getBlob(2);// 2 means 2nd column data
			byte barr[] = b.getBytes(1, (int) b.length());// 1 means first // image

			FileOutputStream fout = new FileOutputStream("F:\\Java Meterials\\bangalore.jpg");
			fout.write(barr);

			fout.close();
		}

	}

}
