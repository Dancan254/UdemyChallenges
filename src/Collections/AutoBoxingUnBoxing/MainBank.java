package Collections.AutoBoxingUnBoxing;

import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        ArrayList<Double> trans = new ArrayList<>();
        trans.add(45.88);
        trans.add(469.88);
        trans.add(459.88);
        Customers customers =new Customers("Ian", trans);

        ArrayList<Double> transPeris = new ArrayList<>();
        transPeris.add(459.88);
        Customers customerPeris = new Customers("Peris", transPeris);

        ArrayList<Customers> custom = new ArrayList<>();
        custom.add(customers);
        custom.add(customerPeris);

        Banking bank = new Banking("Utalii",custom);

        Banking banking = new Banking("I&M");

        System.out.println(bank);
        System.out.println(banking);
    }
}
