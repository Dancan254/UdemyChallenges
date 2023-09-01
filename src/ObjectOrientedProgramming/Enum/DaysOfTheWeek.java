package ObjectOrientedProgramming.Enum;

public enum DaysOfTheWeek {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args) {

        System.out.println(DaysOfTheWeek.SUNDAY);

        //iterating through the enum

        for (DaysOfTheWeek dd : DaysOfTheWeek.values()){
            System.out.println(dd + " ");
        }

    }
}