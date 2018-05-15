package app;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlbumManager {
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicAlbumsPU");

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input command:");
            String command = scanner.nextLine();
            if (command.equals("exit")) break;
            String[] params = command.trim().split("\\s+");
            switch (params[0]) {
                case "create-artist":
                    createArtist(params[1]); //the artist name
                    break;
                case "create-album":
                    createAlbum(params[1], params[2]); //the album name and the artist name
                    break;
                case "list-albums":
                    listAlbums(params[1]); //the artist name
                    break;				
            }
        }
    }
    private void createArtist(String artistName) {
		//Implement this method
    }
    private void createAlbum(String albumName, String artistName) {
		//Implement this method
    }
    private void listAlbums(String artistName) {
		//Implement this method
    }
    public static void main(String args[]) {
        new AlbumManager().run();
    }
}