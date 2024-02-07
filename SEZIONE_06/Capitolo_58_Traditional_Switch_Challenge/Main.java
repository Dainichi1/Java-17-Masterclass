package SEZIONE_06.Capitolo_58_Traditional_Switch_Challenge;

public class Main {
    public static void main(String[] args) {

        char prova = 'p';

        switch (prova) {
            case 'a' :
                System.out.println("'a' is for Able");
                break;
            case 'b' :
                System.out.println("'b' is for Baker");
                break;
            case 'c' :
                System.out.println("'c' is for Charlie");
                break;
            case 'd' :
                System.out.println("'d' is for Dog");
                break;
            case 'e' :
                System.out.println("'e' id for Easy");
                break;
            default:
                System.out.println("Letter " + prova + " not found");
                break;
        }
    }
}
