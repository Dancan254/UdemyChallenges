package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    //method to addToner

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount < 0 || tempAmount > 100){
            return -1;
        }
        else {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages){

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }


}
