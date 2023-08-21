package ObjectOrientedProgramming.Composition.SmartKitchenProject;

//this project applies the concept of composition
public class SmartKitchen {
    private coffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen(){
        brewMaster = new coffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }
    public SmartKitchen(coffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }
    //getters

    public coffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    //method to add water
    public void addWater(){
        System.out.println("Adding water");
    }
    //method to pour milk
    public void pourMilk(){
        System.out.println("Pouring milk");
    }
    //loading dishwasher
    public void loadDishWasher(){
        System.out.println("Loading dish washer");
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
    brewMaster.setHasWorkToDo(coffeeFlag);
    iceBox.setHasWorkToDo(fridgeFlag);
    dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
