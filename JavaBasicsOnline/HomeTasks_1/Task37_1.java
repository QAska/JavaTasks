/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
a.	Целое число N является четным двузначным числом.
 */

import java.util.Scanner;

public class Task37_1 {
    public static void main(String[] args) {
        int n;
        int temp;
        int count;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        n = in.nextInt();

        count = 0;
        temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if ((n % 2) == 0 && (count == 2))  {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
