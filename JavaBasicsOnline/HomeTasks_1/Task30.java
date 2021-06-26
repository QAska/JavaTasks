/*
Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения.
 */

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double r1, r2, r3;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter r1:");
        r1 = in.nextDouble();
        System.out.println("Enter r2:");
        r2 = in.nextDouble();
        System.out.println("Enter r3:");
        r3 = in.nextDouble();

        res = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("R = " + res);
    }
}
