package learnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        try {
            Porte porte = new Porte(1, 1, 1, true);
            System.out.println("is not lock");
            porte.lock();
        } catch (IllegalBlocException illegalBlocException) {
            System.out.println(illegalBlocException.getMessage());
        } catch (PorteLockedException porteLockedException) {
            System.out.println(porteLockedException.getMessage());
        }
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
