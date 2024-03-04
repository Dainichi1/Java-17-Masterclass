package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_103_Composition_Challenge;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(false);
//
//        kitchen.getBrewMaster().brewCoffe();
//        kitchen.getIceBox().orderFood();
//        kitchen.getDishWasher().doDishes();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();


    }
}
