package com.sk.designpatterns.creational;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	// private static DbSingleton instance = new DbSingleton(); // Eagerly loading

	private static volatile DbSingleton instance = null; // Lazy loading
	private static volatile Connection connection = null;

	private DbSingleton() {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();  
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}

		if (connection != null) {
			throw new RuntimeException("Use getConnection() method to create");
		}

	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

	public static Connection getConnection() {
		if (connection == null) {
			synchronized (DbSingleton.class) {
				if (connection == null) {
					String dbURL = "jdbc:mysql://localhost:3306/sakila";
					try {
						connection = DriverManager.getConnection(dbURL, "root", "password");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}
}
