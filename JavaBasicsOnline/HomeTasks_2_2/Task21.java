/*
Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой – значения аргумента,
второй - соответствующие значения функции: F(x) = x - sin(x).
 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        double a, b;
        double h;
        double y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter h:");
        h = in.nextDouble();

        for (double i = a; i <= b; i += h) {
            y = i - Math.sin(i);
            String strX = String.format("%.4f", i);
            String stry = String.format("%.4f", y);
            System.out.println(strX + "    " + stry);
        }
    }
}
