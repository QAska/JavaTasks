/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int m, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer m:");
        m = in.nextInt();
        System.out.println("Enter integer n:");
        n = in.nextInt();

        for (int i = m; i <= n; i++) {
            for (int x = 2; x <= i / 2; x++) {
                if (i % x == 0) {
                    System.out.println("Denominator of " + i + ": " + x);
                }
            }
        }
    }
}
