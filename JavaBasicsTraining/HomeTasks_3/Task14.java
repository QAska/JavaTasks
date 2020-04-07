/*
Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int a, b;
        int count1, count2;
        String message;

        message = "Enter 1st number: ";
        a = getNumber(message);
        message = "Enter 2nd number: ";
        b = getNumber(message);

        count1 = getNumbersCount(a);
        count2 = getNumbersCount(b);

        if (count1 == count2) {
            System.out.println("Numbers " + a + " and " + b + " have the same amount of digits: " + count1 + ".");
        } else if (count1 > count2) {
            System.out.println("Number " + a + " has more digits: " + count1 + ".");
        } else {
            System.out.println("Number " + b + " has more digits: " + count2 + ".");
        }
    }

    public static int getNumbersCount(int n) {
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static int getNumber(String message) {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
