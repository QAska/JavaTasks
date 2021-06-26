/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int a, b;
        int c;
        int temp1, temp2;
        boolean flag = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer a:");
        a = in.nextInt();
        System.out.println("Enter integer b:");
        b = in.nextInt();

        while (a != 0) {
            c = b;
            temp1 = a % 10;
            while (c != 0) {
                temp2 = c % 10;
                if (temp1 == temp2) {
                    System.out.println(temp1 + " = " + temp2);
                    flag = true;
                    break;
                }
                c = c / 10;
            }
            a = a / 10;
        }

        if (flag == false) {
            System.out.println("There are no the same digits.");
        }
    }
}
