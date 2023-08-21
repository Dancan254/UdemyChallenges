package ObjectOrientedProgramming.Encapsulation;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d%n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.printf("Current job pages: %d, Printer total: %d%n", pagesPrinted, printer.getPagesPrinted());
    }
}
