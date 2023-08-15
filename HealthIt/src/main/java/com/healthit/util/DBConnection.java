package com.healthit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class DBConnection {
	static Connection connection;

	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			//statement.execute(Queries.CREATETABLE);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
