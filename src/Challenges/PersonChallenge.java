package Challenges;

public class PersonChallenge {
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(firstName.isEmpty() && secondName.isEmpty()){
            return "";
        }
        else if(secondName.isEmpty()){
            return firstName;
        } else if (firstName.isEmpty()) {
            return secondName;
        }
        else {
            return firstName + " " + secondName;
        }
    }
}
