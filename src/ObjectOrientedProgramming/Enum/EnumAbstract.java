package ObjectOrientedProgramming.Enum;

enum EnumAbstract {

    ADD {
        @Override
        public double apply(double x, double y){
            return x + y;
        }
    },
    SUBTRACT{
        @Override
        public double apply(double x, double y){
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        public double apply ( double x, double y){
            return x * y;
        }
    },
        DIVIDE {
            @Override
            public double apply(double x, double y) {
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            }
        };

//abstract method
    abstract  double apply(double x, double y);

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println("Sum of " + num1 + " and " + num2 + " y is: " + EnumAbstract.ADD.apply(num1, num2));
        System.out.println("Product of " + num1 + " and " + num2 + " y is: " + EnumAbstract.MULTIPLY.apply(num1, num2));
        System.out.println("Quotient of " + num1 + " and " + num2 + " y is: " + EnumAbstract.DIVIDE.apply(num1, num2));
        System.out.println("Difference of " + num1 + " and " + num2 + " y is: " + EnumAbstract.SUBTRACT.apply(num1, num2));
    }
}

