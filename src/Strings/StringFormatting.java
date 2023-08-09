package Strings;

public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub point" ;
        System.out.println(bulletIt);
        System.out.println();

        String textBlock = """
                Print a bulleted List:
                            \u2022 First point
                                \u2022 Sub point""";
        System.out.println(textBlock);

        //formatting numbers and text
        //integers, double %f, String, char %s, float %f
        int age = 35;
        System.out.printf("Your age is %d%n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float)age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n" , i); //%6d implies that each number must fill 6 space
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
        System.exit(0);
    }
}
