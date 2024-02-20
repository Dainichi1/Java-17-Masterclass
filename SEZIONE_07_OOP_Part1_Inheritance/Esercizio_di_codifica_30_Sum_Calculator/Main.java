package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_30_Sum_Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator operazione = new SimpleCalculator();

        operazione.setFirstNumber(2);
        operazione.setSecondNumber(3);


        System.out.println("Il primo numero è:"+operazione.getFirstNumber());
        System.out.println("Il secondo numero è: "+operazione.getSecondNumber());
        System.out.println("Il risultato dell'addizione è: "+operazione.getAdditionResult());
        System.out.println("Il risultato della sottrazione è: "+operazione.getSubtractionResult());
        System.out.println("Il risultato della moltiplicazione è: "+operazione.getMultiplicationResult());
        System.out.println("Il risultato della divisione è: "+operazione.getDivisionResult());
    }
}
