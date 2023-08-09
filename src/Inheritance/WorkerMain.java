package Inheritance;

public class WorkerMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Ian Ogaro", "10/10/2002", "10/10/2023");
        System.out.println(emp);
        System.out.println("Age = " + emp.getAge(2023));
        System.out.println("pay = " + emp.collectPay());

        SalariedEmployee dan = new SalariedEmployee("dancan", "08/02/2003", "10/10/2023", 35000);
        System.out.println(dan);
        System.out.println("Dans pay check = $" + dan.collectPay());

        dan.retire();
        System.out.println("Pension check = $" + dan.collectPay());

        HourlyEmployee peris = new HourlyEmployee("Peris", "28/05/2005", "03/03/2021", 34);
        System.out.println(peris);
        System.out.println("Peris' paycheck = $" + peris.collectPay());
        System.out.println("Peris' holiday pay = $" + peris.getDoublePay());


    }
}
