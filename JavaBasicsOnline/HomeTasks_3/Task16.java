/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;

        n = getNumber();

        printResult(n);
    }

    public static void printResult(int n) {
        for (int i = n; i < 2 * n - 2; i++)
            if (checkIfPrimeNumber(i) && checkIfPrimeNumber(i + 2))
                System.out.println(i + ", " + (i + 2));
    }

    public static boolean checkIfPrimeNumber(int n) {
        boolean flagPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flagPrime = false;
                break;
            }
        }

        return flagPrime;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter integer number >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
