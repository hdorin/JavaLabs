package app;

import controller.AlbumController;
import controller.ArtistController;
import entity.Album;
import entity.Artist;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AlbumManager {
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
    static final ArtistController artistController = new ArtistController(emf);
    static final AlbumController albumController = new AlbumController(emf);

    private void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input command:");
            String command = scanner.nextLine();
            if (command.equals("exit")) break;
            String[] params = command.trim().split("\\s+");
            switch (params[0]) {
                case "create-artist":
                    createArtist(params[1], params[2]); //the artist name
                    break;
                case "create-album":
                    createAlbum(params[1], params[2]); //the album name and the artist name
                    break;
                case "list-albums":
                    listAlbums(params[1]); //the artist name
                    break;
                case "quit":
                    System.exit(1);
            }
        }
    }
    private void createArtist(String artistName, String country) {
//		...//Implement this method
        Artist artist = new Artist(artistName, country);
        artistController.create(artist);
    }
    private void createAlbum(String albumName, String artistName) {
//		...//Implement this method
        Album album = new Album(albumName, "Radiohead");
        albumController.create(album);

    }
    private void listAlbums(String artistName) {
//		...//Implement this method
        System.out.println(albumController.findByName(artistName));
//        artistController.findByName(artistName);
    }
    public static void main(String args[]) {
        new AlbumManager().run();
    }
}