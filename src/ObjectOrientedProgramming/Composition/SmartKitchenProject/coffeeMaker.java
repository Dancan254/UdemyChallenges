package ObjectOrientedProgramming.Composition.SmartKitchenProject;

public class coffeeMaker {
    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}
