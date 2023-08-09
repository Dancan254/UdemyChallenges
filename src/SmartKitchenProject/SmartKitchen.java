package SmartKitchenProject;

//this project applies the concept of composition
public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen(){
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }
    public SmartKitchen(CoffeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }
    //getters

    public CoffeMaker getBrewMaster() {
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
        brewMaster.breCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
