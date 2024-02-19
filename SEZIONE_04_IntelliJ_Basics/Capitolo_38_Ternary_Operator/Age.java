package SEZIONE_04_IntelliJ_Basics.Capitolo_38_Ternary_Operator;

public class Age {

    public static void main(String[] args) {

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is "+ageText);

    }

}
