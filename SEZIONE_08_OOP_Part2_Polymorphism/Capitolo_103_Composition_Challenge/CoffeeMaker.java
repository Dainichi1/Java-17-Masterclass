package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_103_Composition_Challenge;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe() {
        if (hasWorkToDo) {
            System.out.println("Sto facendo il caffè!");
            hasWorkToDo = false;
        }
    }
}
