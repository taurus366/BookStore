package database;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connect {
	public String schema = "bdPqb99Wwd";
	public String name = "bdPqb99Wwd";
	public String password = "5LPoruxZm9";

	public Connection getConnectionLink() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		return (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/" + schema, name, password);
	}
}
