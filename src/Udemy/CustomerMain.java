package Udemy;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("name: " + customer.getName());
        System.out.println("credit limit: " + customer.getCreditLimit());
        System.out.println("email address: " + customer.getEmailAddress());

        System.out.println();

        Customer second = new Customer("peris", 1000, "peris@gamil.com");
        System.out.println("name: " + second.getName());
        System.out.println("credit limit: " + second.getCreditLimit());
        System.out.println("email address: " + second.getEmailAddress());

        System.out.println();

        Customer third = new Customer("kamshu", "kamashu@gmail.com");
        System.out.println("name: " + third.getName());
        System.out.println("credit limit: " + third.getCreditLimit());
        System.out.println("email address: " + third.getEmailAddress());

    }
}
