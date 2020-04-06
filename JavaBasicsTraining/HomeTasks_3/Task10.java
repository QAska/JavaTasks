/*
Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        int factorial;

        n = getNumber();

        factorial = calcOddFactorial(n);

        System.out.println("Factorial of odd numbers from 1 to " + n + " is " + factorial + ".");

    }

    public static int calcOddFactorial(int n) {
        int mult = 1;

        for (int i = 1; i <= 9; i = i + 2) {
            mult *= i;
        }

        return mult;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
