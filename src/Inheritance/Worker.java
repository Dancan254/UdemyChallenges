package Inheritance;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    //getters


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge(int currentYear){
        int birthYear = Integer.parseInt(birthDate.substring(6));
        //substring(6) is a method of the String class. It is used to extract a substring of a string. In this case, the substring is extracted starting from the 6th character of birthDate.
        return (currentYear - birthYear);
    }

    public double collectPay(){
      return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
