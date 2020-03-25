/*
Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
получить значение а8 (степень) за три операции и а10 за четыре операции.
 */

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        double a;
        double a2, a4, a8, a10;
        double res8, res10;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();

        a2 = a * a;
        a4 = a2 * a2;
        a8 = a4 * a4;
        a10 = a8 * a2;

        System.out.println("a8 = " + a8 + ", a10 = " + a10);

    }
}
