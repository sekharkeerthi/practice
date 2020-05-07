package com.sk.designpatterns.creational;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo2 {

	public static void main(String[] args) {
		long beforeCon = System.currentTimeMillis();
		DbSingleton dbSingleton = DbSingleton.getInstance();
		Connection connection = dbSingleton.getConnection();
		long afterCon = System.currentTimeMillis();
		System.out.println("Connection time : " + (afterCon - beforeCon));
		Statement stmt;
		ResultSet rs;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from actor");
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//			connection.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		System.out.println("<------------------------------------------------------------------------------------------>");
		beforeCon = System.currentTimeMillis();
		dbSingleton = DbSingleton.getInstance();
		connection = dbSingleton.getConnection();
		afterCon = System.currentTimeMillis();
		System.out.println("Connection time : " + (afterCon - beforeCon));
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from actor");
			/*
			 * while (rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2) +
			 * "  " + rs.getString(3));
			 */
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
