/*
Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        double sum;
        double dif;
        double mult;
        double quit;

        sum = x + y;
        dif = x - y;
        mult = x * y;
        quit = x / y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + dif);
        System.out.println(x + " * " + y + " = " + mult);
        System.out.println(x + " / " + y + " = " + quit);
    }
}
