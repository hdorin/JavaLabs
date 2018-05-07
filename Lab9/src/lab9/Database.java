package lab9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Database {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "STUDENT";
    private static final String PASSWORD = "STUDENT";
    private static Connection connection = null;
    private Database() { }

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
