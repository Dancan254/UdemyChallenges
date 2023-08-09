package Challenges;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumbers complex1 = new ComplexNumbers(2,5);
        ComplexNumbers complex2 = new ComplexNumbers(4, -4);

        System.out.println("First real: " + complex1.getReal());
        System.out.println("Second real: " + complex2.getReal());
        System.out.println("First imaginary: " + complex1.getImaginary());
        System.out.println("Second imaginary: " + complex2.getImaginary());

        complex1.add(2,3);//expected real=(2+2), imaginary =(5+3)
        System.out.println("sum of real: " + complex1.getReal());
        System.out.println("sum of imaginary: " + complex1.getImaginary());

        System.out.println();
        //real(2 + 2-4) imaginary(5+ 3 +5)
        complex1.subtract(4, -5);
        System.out.println("sum of real: " + complex1.getReal());
        System.out.println("sum of imaginary: " + complex1.getImaginary());
    }
}
