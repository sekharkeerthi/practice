package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@//ffeuswduxdb159.foxinc.com:1521/ITVQ15.WORLD", "tuscany", "TusEpisode_2");
		System.out.println("Connection Succesful...");

		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = statement.executeQuery("select * from division_code");
		rs.beforeFirst();

		while (rs.next()) {
			System.out.println(rs.getObject(2));
		}

		ResultSetMetaData rsm = rs.getMetaData();

		System.out.println("Count:" + rsm.getColumnCount());

		CallableStatement callableStatement = connection.prepareCall("{call GET_DIVISION_CODE(?)}");

		callableStatement.registerOutParameter("DIVISION_CODE", java.sql.Types.VARCHAR);

		callableStatement.execute();

		System.out.println(callableStatement.getString("DIVISION_CODE"));

		DatabaseMetaData dbmd = connection.getMetaData();

		System.out.println(dbmd.getDatabaseProductName());

	}

}
