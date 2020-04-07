/*
Даны натуральные числа К и N. Написать метод (методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N. Пример: K = 8, N = 100. Вывод: 8 17 26 35 44 53 62 71 80
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int k, n;
        int size;
        String message;

        message = "Enter first number, K: ";
        k = getNumber(message);
        message = "Enter second number, N: ";
        n = getNumber(message);

        size = getArraySize(k, n);
        int[] array = new int[size];
        initArray(array, k, n);
        if (array.length == 0) {
            System.out.println("There are no numbers satisfying the condition.");
        } else {
            printArray(array, size);
        }
    }

    public static void initArray(int[] array, int k, int n) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (getSumOfDigits(i) == k) {
                array[index] = i;
                index++;
            }
        }
    }

    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static int getArraySize(int k, int n) {
        int size = 0;

        for (int i = 1; i <= n; i++) {
            if (getSumOfDigits(i) == k) {
                size++;
            }
        }

        return size;
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
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
