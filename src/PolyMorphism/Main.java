package PolyMorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie  = Movie.getMovie("Adventure","Star Wars");
//        theMovie.watchMovie();
//
//        Adventure movie = new Adventure("Jumanji");
//        movie.watchMovie();

        Scanner sn = new Scanner(System.in);
        while(true){
        System.out.println("Enter type of movie(A for Adventure, S for SciFi, C for comedy, or Q to quit");
        String choice = sn.nextLine();

        if (choice.equalsIgnoreCase("Q")){
            break;
        }

            System.out.println("Enter movie title");
            String title = sn.nextLine();
            Movie theMovie = Movie.getMovie(choice, title);
            theMovie.watchMovie();

        }
    }

}
