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

        System.out.println("Sum of x and y is: " + EnumAbstract.ADD.apply(5, 4));
    }
}

