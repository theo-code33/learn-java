package learnJava;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Main.affichage("Marty");
        List<Integer> numbers = Arrays.asList(1220, 1452, 1445, 0, 5874, 0, 3);
        Main.zeroCounter(numbers);
    }

    public static void zeroCounter(List<Integer> numbers) {
        Integer countOfZero = 0;
        for(Integer number: numbers) {
            if(number == 0) {
                countOfZero++;
            }
        }
        System.out.println(countOfZero);
    }

    public static void affichage(String messageToPrint) {
        String message = "Bonjour " + messageToPrint;
        System.out.println(message);
    }

    public static int addition(final int number1, final int number2) {
        return number1 + number2;
    }
}
