package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private static final String USER = "root";
	private static final String PASSWORD = "3cl1ps3J4v4SQL";
	private static final String URL = "jdbc:mysql://localhost/ddims?serverTimezone=UTC";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static Connection connection;
	
	private static Statement statement;
	
	public static void connection() throws SQLException, ClassNotFoundException {
		Class.forName(Database.DRIVER);
		System.out.println("Establishing Database Connection...");
		connection = DriverManager.getConnection(Database.URL, Database.USER, Database.PASSWORD);
		statement = connection.createStatement();
	}
	
	public static void updateSQL(String query) throws SQLException {
		statement.executeUpdate(query);
	}
	
	public static ResultSet querySQL(String query) throws SQLException {
		ResultSet result = statement.executeQuery(query);
		return result;
	}
	
	public static void disconnection() throws SQLException {
		System.out.println("Disconnecting from Database...");
		connection.close();
	}
}
