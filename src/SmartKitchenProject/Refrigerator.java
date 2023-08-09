package SmartKitchenProject;

public class Refrigerator {
    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}
