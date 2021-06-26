/*
Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
 */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        double rInt;
        double rExt;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter r:");
        rInt = in.nextDouble();
        System.out.println("Enter r:");
        rExt = in.nextDouble();

        res = Math.PI * (Math.pow(rExt, 2) - Math.pow(rInt, 2));
        System.out.println("S = " + res);
    }
}
