package SEZIONE_06.CApitolo_66_Digit_Sum_Challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(258));
    }

    private static int sumDigits (int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}

/*
Inizializzazione e Controllo del Valore Iniziale:

Viene chiamato sumDigits(258).
Il metodo verifica se il numero è minore di 0. In questo caso, 258 non è minore di 0, quindi non ritorna -1 e continua l'esecuzione.
Inizializzazione della Variabile sum:

int sum = 0; - La variabile sum è inizializzata a 0.
Esecuzione del Ciclo while:

Il ciclo while verifica se number (258 in questo caso) è maggiore di 9. Poiché 258 è maggiore di 9, entra nel ciclo.

Primo Passaggio del Ciclo:

number % 10 è 258 % 10, che dà 8 (l'ultima cifra di 258).
sum += 8; - La variabile sum ora è 8.
number = 258 / 10; - Riduce number a 25 (rimuove l'ultima cifra).
Secondo Passaggio del Ciclo:

Ora number è 25, ancora maggiore di 9, quindi il ciclo continua.
number % 10 è 25 % 10, che dà 5.
sum += 5; - Aggiunge 5 a sum, quindi sum ora è 8 + 5 = 13.
number = 25 / 10; - Riduce number a 2.
Terzo Passaggio del Ciclo:

Ora number è 2, che è minore di 9, quindi il ciclo while termina.
Dopo il Ciclo while:

sum += number; - Aggiunge il valore residuo di number (che è 2) a sum. Quindi sum diventa 13 + 2 = 15.
Ritorno del Risultato:

return sum; - Il metodo restituisce il valore di sum, che è 15.
 */