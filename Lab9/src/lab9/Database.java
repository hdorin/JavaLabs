package lab9;

import java.sql.*;

class DatabaseOracle {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "STUDENT";
    private static final String PASSWORD = "STUDENT";
    private static Connection connection = null;

    private DatabaseOracle() {
    }

    static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    //Implement the method createConnection()
    private static void createConnection() {
        try {
            Class.forName(URL);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    //Implement the method closeConnection()
    static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Implement the method commit()
    static void commit() {

    }

    //Implement the method rollback()
    static void rollback() {

    }
}

class DatabaseMySql {
    private static final String URL = "jdbc:mysql://localhost/test";
    private static final String USER = "localhost@root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    private DatabaseMySql() {
    }

    static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    //Implement the method createConnection()
    private static void createConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM test";
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Implement the method closeConnection()
    static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Implement the method commit()
    static void commit() {

    }

    //Implement the method rollback()
    static void rollback() {

    }
}