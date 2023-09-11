package EmailAdministration;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String secondName;
   private String password;
   private String department;
   private String email;
   private final int defaultPasswordLength = 10;
   private int mailBoxCapacity = 500;
   private String alternateEmail;
   private final String companySuffix ="students.dkut.ac.ke";

   //constructor to receive first and last name

    public Email(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        //call a method for the department
        this.department = department();
        this.password = randomPassword(defaultPasswordLength);
        this.email = emailGen();

        //method to generate email

        //System.out.println("Your email is: " + email);
    }
    private String emailGen(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter year of admission: ");
        String year = sn.nextLine().substring(2,4);
        email = secondName.toLowerCase() + "." + firstName.toLowerCase() + year  +"@" + companySuffix;
        System.out.println("Your password is: " + this.password);
        return email;
    }

    //ask for department
    private String department(){
        System.out.println("New worker " + firstName + "\nEnter the department code: \n1 Mechatronics\n2 Mechanical\n3 Chemical");
        Scanner sn = new Scanner(System.in);
        int departmentChoice = sn.nextInt();
        //can use switch case
        if(departmentChoice == 1){
            return "Mechatronics";
        }
        else if(departmentChoice == 2){
            return "Mechanical";
        }else if (departmentChoice == 3){
            return "Chemical";
        }else {
            return "";
        }
    }

    //Generate random password
    private String randomPassword(int length){
        String passWordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@!&%*()~!?1234567890abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random()*passWordSet.length());
            password[i] = passWordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public void showInfo(){
        System.out.println("DISPLAY NAME: " + firstName + " " + secondName +
                            "\nCOMPANY EMAIL: " + email +
                                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb");
    }
}
