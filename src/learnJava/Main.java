package learnJava;

public class Main {
    public static void main (String[] args) {
        int somme = Main.addition(2, 7);
        System.out.println(somme);
    }

    public static void affiche(String messageToPrint) {
        System.out.println(messageToPrint);
    }

    public static int addition(final int number1, final int number2) {
        return number1 + number2;
    }
}
