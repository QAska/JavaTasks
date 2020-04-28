/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

import java.util.Random;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        int n;
        int[] array;

        n = getNumber();
        array = new int[n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        zipArray(array);
        System.out.println("Array with zeroes:");
        printArray(array);
        System.out.println("Zipped array:");
        printNotZero(array);
    }

    public static void printNotZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void zipArray(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter integer n >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers ae allowed! Try again: ");
            }
            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
