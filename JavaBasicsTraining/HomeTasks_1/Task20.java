/*
Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        double d;
        double s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter d:");
        d = in.nextDouble();

        s = Math.PI * (Math.pow(d / 2, 2));

        System.out.println("s = " + s);
    }
}
