/*
Требуется определить факториал числа, которое ввел пользователь.
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        int n;
        int mult;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextInt();

        mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        System.out.println("Factorial = " + mult);
    }
}
