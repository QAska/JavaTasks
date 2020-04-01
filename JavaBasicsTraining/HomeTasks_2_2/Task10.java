/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task10 {
    public static void main(String[] args) {
        long mult = 1;

        for (int i = 1; i <= 200; i++) {
            mult *= Math.pow(i, 2);
        }

        System.out.println(mult);
    }
}
