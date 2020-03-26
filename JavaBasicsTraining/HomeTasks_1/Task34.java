/*
Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int bytes;
        double kBytes;
        double mBytes;
        double gBytes;
        double tBytes;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of bytes: ");
        bytes = in.nextInt();

        kBytes = bytes / Math.pow(2, 10);
        mBytes = bytes / Math.pow(2, 20);
        gBytes = bytes / Math.pow(2, 30);
        tBytes = bytes / Math.pow(2, 40);

        System.out.println(kBytes);
        System.out.println(mBytes);
        System.out.println(gBytes);
        System.out.println(tBytes);
    }
}
