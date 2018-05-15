package lab9;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {
        try {
            ArtistController artists = new ArtistController();
            AlbumController albums = new AlbumController();

            artists.create("Radiohead", "United Kingdom");
            artists.create("Phoenix", "Romania");
            DatabaseMySql.commit();


            int phoenixId = artists.findByName("Phoenix");
            albums.create("Mugur de fluier", phoenixId, 1974);


//            Add the Radiohead's albums ("OK Computer", 1997), ("Kid A", 2000), ("In Rainbows", 2007)

            Integer radioheadId = 0;
            radioheadId = artists.findByName("Radiohead");
            albums.create("OK Computer", radioheadId, 1997);
            albums.create("Kid A", radioheadId, 2000);
            albums.create("In Rainbows", radioheadId, 2007);

            albums.list(radioheadId); //displays all the albums from the specified artist
            DatabaseMySql.commit();

            DatabaseMySql.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            DatabaseMySql.rollback();
        }
    }
}
