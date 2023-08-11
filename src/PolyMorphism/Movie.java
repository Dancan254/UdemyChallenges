package PolyMorphism;

public class Movie {
    private  String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
        System.out.println();
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("..".repeat(4)+
                "\nPleasant Scene"+
                "\nScary Music"+
                "\nSomething Bad Happens");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
        System.out.println();
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("..".repeat(4) +
                "\nunexpected Scene" +
                "\nRock Music" +
                "\nAliens appear");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
        System.out.println();
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println(".. ".repeat(4)+
                "\nHappy Scene"+
                "\nloud Music"+
                "\nback ground people laugh");
    }
}