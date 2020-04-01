/*
Даны три числа a, b, с. Определить, какое из них равно d.
Если ни одно не равно d, то найти max(d — a, d — b, d — c).
 */

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double a, b, c;
        double d;
        double difDa, difDb, difDc;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();
        System.out.println("Enter d:");
        d = in.nextDouble();

        if (a == d) {
            System.out.println("a is equal d");
        }
        if (b == d) {
            System.out.println("b is equal d");
        }
        if (c == d) {
            System.out.println("c is equal d");
        }
        if (a != d && b != d && c != d) {
            difDa = d - a;
            difDb = d - b;
            difDc = d - c;
            System.out.println(difDa + ", " + difDb + ", " + difDc);
            if (difDa > difDb && difDa > difDc) {
                System.out.println("max = " + difDa);
            }
            else if (difDb > difDa && difDb > difDc) {
                System.out.println("max = " + difDb);
            }
            else {
                System.out.println("max = " + difDc);
            }
        }
    }
}
