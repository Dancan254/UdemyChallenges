package Udemy;

public class PersonMain {
    public static void main(String[] args) {
        PersonChallenge person = new PersonChallenge();
        person.setFirstName("");
        person.setSecondName("");
        person.setAge(10);
        System.out.println("Full name : " + person.getFullName());
        System.out.println("Teen: " + person.isTeen());

        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setSecondName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
