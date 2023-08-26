package Collections.AutoBoxingUnBoxing;

import java.util.ArrayList;

public class Customers {
    protected String name;
    private ArrayList<Double> transactions;

    public Customers(String name, ArrayList<Double> transactions) {
        this.name = name.toUpperCase();
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public String name() {
        return name;
    }
}
