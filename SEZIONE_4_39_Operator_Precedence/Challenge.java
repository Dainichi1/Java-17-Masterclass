package it.udemy.com.SEZIONE_4_39_Operator_Precedence;

public class Challenge {
    public static void main(String[] args) {

        double first_Variable = 20.00d;
        double second_Variable = 80.00d;
        double result = (first_Variable + second_Variable) * 100.00d;

        double remainder = result % 40.00d;

        System.out.println(remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;

        System.out.println("isNoRemainder = "+isNoRemainder);

        if (isNoRemainder == false) {
            System.out.println("got some remainder");
        }

    }

}
