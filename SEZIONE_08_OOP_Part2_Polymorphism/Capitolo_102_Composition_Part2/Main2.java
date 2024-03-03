package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_102_Composition_Part2;


public class Main2 {

    public static void main(String[] args) {

        ComputerCase2 theCase2 = new ComputerCase2("2208","Dell",
                "240");
        Monitor2 theMonitor2 = new Monitor2("27 inch","Acer",
                27,"2540 x 1440");
        MotherBoard2 theMotherboard2 = new MotherBoard2("BJ-200","ASUS",
        4,6,"v2.44");
        PersonalComputer2 thePC = new PersonalComputer2("2208","Dell",
                theCase2, theMonitor2,theMotherboard2);

        thePC.powerUp();






    }
}
