package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    //using scanner to create album
    public static Album createAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the album: ");
        String name = scanner.nextLine();
        System.out.print("Enter the artist's name: ");
        String artist = scanner.nextLine();
        return new Album(name, artist);
    }

    //using scanner to add song
    public void addSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the song: ");
        String title = scanner.nextLine();
        System.out.print("Enter the duration of the song: ");
        double duration = scanner.nextDouble();
        addSong(title, duration);
    }

    //method to add song has two parameters , title, duration
    public boolean addSong(String title, double duration){

        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    //method to find song
    public Song findSong(String title){
        for(Song song: songs){
            if (song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    //method to addToPlayList
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if (trackNumber >= 1 && trackNumber <= songs.size()){
            playList.add(songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song  = findSong(title);
        if (song != null){
            playList.add(song);
            return true;
        }
        return false;
    }
}
