/*
23.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой – значения аргумента,
второй - соответствующие значения функции: F(x) = ctg(x/3) + 1/2*sin(x).
 */

import java.util.Scanner;

public class Task23 {
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

        for (double x = a; x <= b; x += h) {
            y = 1 / Math.tan(x / 3) + (double) 1 / 2 * Math.sin(x);
            String strX = String.format("%.4f", x);
            String strY = String.format("%.4f", y);
            System.out.println(strX + "    " + strY);
        }
    }
}
