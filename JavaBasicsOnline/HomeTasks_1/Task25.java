/*
Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с
(предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double d;
        double x, x1, x2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        // Если D > 0, то квадратное уравнение имеет два корня; если D = 0, то 1 корень;
        // если D < 0, то делают вывод, что корней нет.
        if (d < 0) { // a = 8, b = 4, c = 2
            System.out.println("Корней нет");
        }
        else if (d == 0) { // a = 2, b = 4, c = 2
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else { // a = 3.2, b = -7.8, c = 1
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
