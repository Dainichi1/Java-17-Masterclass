package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_103_Composition_Challenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Sto lavando i piatti!");
            hasWorkToDo = false;
        }
    }
}
