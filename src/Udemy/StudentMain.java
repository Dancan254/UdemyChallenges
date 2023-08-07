package Udemy;

public class StudentMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
                IanStudent one = new IanStudent(
                        switch(i){
                         case 1 -> "Peris";
                        case 2 -> "Ian";
                        case 3 -> "Ann";
                        case 4 -> "Duncan";
                        case 5 -> "Muthoni";
                        default -> "Anonymus";
                },
                        "4000" + i,
                        "08/02/2003",
                        "Ian's School of Coding");
                System.out.println(one);
        }
        //System.out.println();
        System.exit(0);
    }
}
