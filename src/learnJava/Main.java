package learnJava;

public class Main {
    public static void main (String[] args) {
        Main.affichage("Marty");
    }

    public static void affichage(String messageToPrint) {
        String message = "Bonjour " + messageToPrint;
        System.out.println(message);
    }

    public static int addition(final int number1, final int number2) {
        return number1 + number2;
    }
}
