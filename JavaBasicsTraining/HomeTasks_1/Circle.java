/*
Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

import java.util.Scanner;

public class Circle {
    public static void main(String args[]) {
        Double r, l, s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter R:");
        r = in.nextDouble();

        l = 2 * Math.PI * r;
        s = Math.PI * Math.pow(r, 2);
        System.out.println("l = " + l);
        System.out.println("S = " + s);
    }
}
