package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_103_Composition_Challenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Sto ordinando del cibo!");
            hasWorkToDo = false;
        }
    }

}
