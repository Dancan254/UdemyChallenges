package ObjectOrientedProgramming.Composition.SmartKitchenProject;

public class DishWasher {
    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing dishes");
            hasWorkToDo = false;
        }
    }
}
