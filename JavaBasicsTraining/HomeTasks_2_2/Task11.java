/*
Составить программу нахождения разности кубов первых двухсот чисел.
 */

public class Task11 {
    public static void main(String[] args) {
        long dif;

        dif = 0;
        for (int i = 1; i <=200; i++) {
            dif -= Math.pow(i, 3);
        }

        System.out.println(dif);
    }
}
