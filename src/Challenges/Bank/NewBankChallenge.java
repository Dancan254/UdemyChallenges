package Challenges.Bank;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

   public Customer(String name, double initialDeposit){

       this(name.toUpperCase(),
               new ArrayList<Double>(500));
       transactions.add(initialDeposit);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public ArrayList<Double> transactions() {
        return transactions;
    }
}
public class NewBankChallenge {
    public static void main(String[] args) {

        Customer customer = new Customer("Ian", 5000);
        BankClass bank = new BankClass();
        bank.addCustomer("Ian", 600);
        bank.addCustomer("Ian", 6000);


    }
}
