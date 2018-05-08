package lab9;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        ArtistController artists = new ArtistController();
        AlbumController albums = new AlbumController();

        try {
            artists.create("Radiohead", "United Kingdom");
            artists.create("Phoenix", "Romania");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        DatabaseMySql.commit();

        int phoenixId = 0;
        try {
            phoenixId = artists.findByName("Phoenix");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

//            nu inteleg ce e cu ordinea parametrilor
//            albums.create(phoenixId, "Mugur de fluier", 1974);//


//        Add the Radiohead's albums ("OK Computer", 1997), ("Kid A", 2000), ("In Rainbows", 2007)

        Integer radioheadId = 0;
        albums.list(radioheadId); //displays all the albums from the specified artist
        DatabaseMySql.commit();

        DatabaseMySql.closeConnection();


    }

}
