/*
Составить программу сравнения двух чисел 1 и 2.
Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no».
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        double a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        if (a < b) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
