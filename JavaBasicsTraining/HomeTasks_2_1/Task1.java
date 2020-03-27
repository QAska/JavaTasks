/*
Составить программу сравнения двух чисел 1 и 2.
Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();

        if (a < b) {
            System.out.println(7);
        }
        else {
            System.out.println(8);
        }

    }
}
