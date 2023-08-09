package Udemy;

public class SimpleCalculatorMain {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(40);
        calculator.setSecondNumber(50);
        System.out.println("sum is: " + calculator.getAddition());
        System.out.println("Difference is: " + calculator.getSubtraction());
        System.out.println("Quotient is: " + calculator.getDivision());
        System.out.println("Multiplication is: " + calculator.getMultiplication());
    }
}
