/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int n;
        int[] array;
        int maxCount;

//        n = getNumber();
        array = new int[]{1, 3, 3, 3, 0, 0, 0, 1};

//        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        maxCount = getMaxCount(array);
        System.out.println(maxCount);
    }

    public static int getMaxCount(int[] array) {
        int count;
        int maxCount;


        maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    System.out.println("count = " + count);
                    if (count > maxCount) {
                        maxCount = count;
                    }
                } else {
                    count = 1;
                    System.out.println("count = " + count);
                    break;
                }
            }
        }

        return maxCount;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4) - 2;
        }
    }

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter size of the array, n >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
