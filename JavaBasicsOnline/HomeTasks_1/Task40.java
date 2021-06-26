/*
Дано значение х. Получить значения -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3.
Позаботьтесь об экономии операций.
 */

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        double x;
        double res1, res2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        res1 = ((-4 * x + 3) * x - 2) * x;
        res2 = ((4 * x + 3) * x + 2) * x + 1;
        System.out.println(res1 + ", " + res2);
    }
}
