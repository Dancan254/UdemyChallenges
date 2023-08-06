package Udemy;

/**
 * bankAccount: a/c number, a/c balance, customer name,
 * email, phone number
 *getters and setters
 * methods: depositing, withdrawing
 */
public class BankChallenge {

    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double accountBalance;


    //constructor chaining
    public BankChallenge(){
        this("400017", "default name", "default mail", "default number");
    }
    public BankChallenge(String accountNumber, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //method for depositing
    //has one parameter i.e. amount deposited
    public void deposit(double depositAmount){
        if(depositAmount < 0) {
            System.out.println("Invalid amount" + "\nYou deposited $" + depositAmount);
        }
        else{
            accountBalance += depositAmount;
            System.out.println("You have successfully deposited $" + depositAmount);
            showBalance();
            }
    }

    //method for withdrawing
    public void withdraw(double withdrawAmount){
        if (withdrawAmount < 0){
            System.out.println("Invalid amount" + "\nYou attempted to withdraw &" + withdrawAmount);
        }
        if(withdrawAmount > 0){
            if(withdrawAmount > accountBalance){
                System.out.println("You have insufficient funds to withdraw $" + withdrawAmount);
                showBalance();
            }
            else{
                accountBalance -= withdrawAmount;
                System.out.println("You have successfully withdrawn $" + withdrawAmount);
                showBalance();
            }
        }
    }
    //method to show balance
    public void showBalance(){
        System.out.println("Your account balance is $" + accountBalance);
    }
    //toString method


    public void showInfo() {
        System.out.println("BankChallenge{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}');
    }
}
