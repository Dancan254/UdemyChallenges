package Collections.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PlayListMain {
    public static void main(String[] args) {
        LinkedList<Album> albums = new LinkedList<>();
        LinkedList<Song> playlist = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many albums do you want to create? ");
        int numAlbums = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numAlbums; i++) {
            Album album = Album.createAlbum();
            albums.add(album);

            System.out.print("How many songs do you want to add to this album? ");
            int numSongs = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            for (int j = 0; j < numSongs; j++) {
                album.addSong();
            }
        }

        System.out.println("Creating playlist...");
        albums.get(0).addToPlayList(1, playlist);
        albums.get(5).addToPlayList(2, playlist);

        System.out.println("Playlist songs:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }


}
