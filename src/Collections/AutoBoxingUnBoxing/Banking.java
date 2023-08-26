package Collections.AutoBoxingUnBoxing;

import java.util.ArrayList;

public class Banking {
    private String name;
    private ArrayList<Customers> customers = new ArrayList<>(500);

    public Banking(String name, ArrayList<Customers> customer) {
        this.name = name;
        this.customers = customer;

    }

    public Banking(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //add more functionality
    public Customers getCustomers(String name) {
        //iterate through the list
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(name)){
                return customer;
            }
        }
        System.out.printf("customer (%s) was not found %n", name);
        return null;
    }

    @Override
    public String toString() {
        return "Banking{" +
                "name='" + name + '\'' +
                ", customer=" + customers +
                '}';
    }
}
