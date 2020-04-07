/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        int size;

        n = getNumber();

        size = getArraySize(n);
        int[] array = new int[size];

        initArray(array, n);
        printArray(array);

    }

    public static void initArray(int[] array, int n) {


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

    public static boolean checkIfTwins(int a, int b) {
        boolean flagTwins = false;
        if (b - a == 2) {
            flagTwins = true;
        }

        return flagTwins;
    }

    public static int getArraySize(int n) {
        int count = 0;
        for (int i = n; i <= n * 2; i++) {
            if (checkIfPrimeNumber(i)) {
                count++;
            }
        }

        return count;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
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
