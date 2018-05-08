package lab9;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test", "localhost@root", "");
            Statement stmt = (Statement) conn.createStatement();
            String sql = "SELECT * FROM test";
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
