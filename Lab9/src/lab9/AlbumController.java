package lab9;

import java.sql.*;

public class AlbumController {

    void create(String name, Integer artist_id, Integer release_year) throws SQLException {
        Connection con = DatabaseMySql.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("insert into artists (name, artist_id, release_year) values (?, ?, ?)")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, artist_id);
            pstmt.setInt(3, release_year);
            pstmt.executeUpdate();
        }
    }

    public Integer findByName(String name) throws SQLException {
        Connection con = DatabaseMySql.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from artists where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    void list(Integer artistId) throws SQLException {
        Connection con = DatabaseMySql.getConnection();

        try (Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM albums WHERE artist_id = '" + artistId + "'")) {

            while (rs.next()) {
                System.out.println(rs);
            }
        }
    }

}
