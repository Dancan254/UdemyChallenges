package ObjectOrientedProgramming.Enum;

public enum DaysOfTheWeek {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args) {
        System.out.println(DaysOfTheWeek.SUNDAY);

        //iterating through the enum
        for (DaysOfTheWeek dd : DaysOfTheWeek.values()){
            //System.out.println(dd + " ");
            SwitchDayOfWeek(dd);
        }
        System.out.println(DaysOfTheWeek.FRIDAY + " is the " + DaysOfTheWeek.FRIDAY.ordinal() + "th day of the week");

    }

    public static void SwitchDayOfWeek(DaysOfTheWeek weekDay){

        int weekdayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case SUNDAY -> System.out.println("Sunday is day : " + weekdayInteger);
            case MONDAY -> System.out.println("Monday is day : " + weekdayInteger);
            case TUESDAY -> System.out.println("Tuesday is day : " + weekdayInteger);
            case WEDNESDAY -> System.out.println("Wednesday is day : " + weekdayInteger);
            case THURSDAY -> System.out.println("Thursday is day : " + weekdayInteger);
            case FRIDAY -> System.out.println("Friday is day : " + weekdayInteger);
            case SATURDAY -> System.out.println("Saturday is day : " + weekdayInteger);
            default -> System.out.println("Day chosen not present");
        }
    }
}
