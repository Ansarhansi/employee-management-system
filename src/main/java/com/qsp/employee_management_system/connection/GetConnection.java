package com.qsp.employee_management_system.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	private static final String url = "jdbc:postgresql://localhost:5432/employee_database";
	private static final String user = "postgres";
	private static final String pwd = "Ansar@12";

	public static Connection getConnection() {

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, user, pwd);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
}
