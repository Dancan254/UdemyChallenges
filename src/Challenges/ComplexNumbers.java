package Challenges;
/**
 * Write a class with the name ComplexNumber.
 * The class needs two fields (instance variables) with name real and imaginary of type double.
 * It represents the Complex Number.
 * The class needs to have one constructor.
 * The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
 * Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
 * Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
 * Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
 * Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.
 */
public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //creating getters

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //method to add
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    //method add with one type ComplexNumber
    //adds the Complex number to the corresponding instance variables
    public void add(ComplexNumbers complexNumber){
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }
    //same methods for subtracting
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumbers complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
