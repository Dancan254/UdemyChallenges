package Challenges;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //getters and setters

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //addition method returns the result
    public double getAddition(){
        return firstNumber + secondNumber;
    }

    public double getSubtraction(){
        if(firstNumber > secondNumber){
        return firstNumber - secondNumber;
        }
        else{
            return secondNumber - firstNumber;
        }
    }

    public double getMultiplication(){
        return firstNumber * secondNumber;
    }

    public double getDivision(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
