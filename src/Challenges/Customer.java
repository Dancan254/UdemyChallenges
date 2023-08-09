package Challenges;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //constructor for all the fields
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //no args constructor
    public Customer() {
        this("Ian","ian@gmail.com");
    }

    //name and email
    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);

    }

    //getter methods
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
