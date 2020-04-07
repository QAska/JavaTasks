/*
Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого являются цифры числа N.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int n;
        int size;

        n = getNumber();
        size = getArraySize(n);

        int[] array = new int[size];
        initArray(array, size, n);
        printArray(array);

        System.out.println(size);
    }

    public static void initArray(int[] array, int x, int n) {
        for (int i = 0; i < x; i++) {
            array[i] = getDigit(n);
            n /= 10;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static int getDigit(int n) {
        int digit;
        digit = n % 10;

        return digit;
    }

    public static int getArraySize(int n) {
        int count;

        count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
