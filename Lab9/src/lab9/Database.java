package lab9;

import java.sql.*;

class DatabaseMySql {
    private static final String URL = "jdbc:mysql://localhost/musicalbums";
    private static final String USER = "dba";
    private static final String PASSWORD = "sql";
    private static Connection conn = null;

    private DatabaseMySql() {
    }

    static Connection getConnection() {
        if (conn == null) {
            createConnection();
        }
        return conn;
    }

    //Implement the method createConnection()
    private static void createConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM albums";
            ResultSet rs = stmt.executeQuery(sql);
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Implement the method closeConnection()
    static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Implement the method commit()
    static void commit() {
    		try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }

    //Implement the method rollback()
    static void rollback() {
    	try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}