/*
Найдите количество четных цифр данного натурального числа.
 */

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int n;
        int num;
        int tmp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n:");
        n = in.nextInt();

        num = 0;
        while (n != 0) {
            tmp = n % 10;
            if (tmp % 2 == 0) {
                num += 1;
            }
            n /= 10;
        }

        System.out.println("Number of even digits: " + num + ".");
    }
}
