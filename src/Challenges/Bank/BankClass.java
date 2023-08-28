package Challenges.Bank;

import java.util.ArrayList;

public class BankClass {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    private Customer getCustomer(String customerName){
        //iterate through the list
        for (var customer: customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.println("Did not find " + customerName);
        return null;
    }

    public void addCustomer(String name, double initialDeposit){
        if (getCustomer(name) == null){
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added "+ customer);
        }

    }
}
