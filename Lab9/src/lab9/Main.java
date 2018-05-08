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

        Integer phoenixId = 0;
        try {
            phoenixId = artists.findByName("Phoenix");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
//        Add the Pheonix's album ("Mugur de fluier", 1974)
        try {
            albums.create("Mugur de fluier", phoenixId, 1974);
        } catch (SQLException e) {
            e.printStackTrace();
        }


//        Add the Radiohead's albums ("OK Computer", 1997), ("Kid A", 2000), ("In Rainbows", 2007)
        Integer radioheadId = 0;
        try {
            radioheadId = artists.findByName("Radiohead");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            albums.create("OK Computer", radioheadId, 1997);
            albums.create("Kid A", radioheadId, 2000);
            albums.create("In Rainbows", radioheadId, 2007);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        try {
            albums.list(radioheadId); //displays all the albums from the specified artist
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DatabaseMySql.commit();

        DatabaseMySql.closeConnection();


    }


}
