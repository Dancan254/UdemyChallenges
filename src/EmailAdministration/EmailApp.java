package EmailAdministration;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Ian", "Duncan");
        //System.out.println();

//        email.setAlternateEmail("ian@email.com");
//        System.out.println(email.getAlternateEmail());
        email.showInfo();
    }
}
