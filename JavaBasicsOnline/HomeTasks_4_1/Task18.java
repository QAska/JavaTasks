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
        int mostFrequentNumber;

        n = getNumber();
        array = new int[n];
        initArray(array);
//        array = new int[]{-3, 0, -2, 4, -1, -3, 1};
        System.out.println("Initial array:");
        printArray(array);

        mostFrequentNumber = getMostFrequentNumber(array);

        System.out.println("The most frequent number: " + mostFrequentNumber + ".");
    }

    public static int getMostFrequentNumber(int[] array) {
        int count;
        int maxCount;
        int index;

        maxCount = 0;
        index = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        index = i;
                    } else if (count == maxCount) {
                        if (array[i] < array[index]) {
                            index = i;
                        }
                    }
                }
            }
        }

        return array[index];
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
            array[i] = random.nextInt(10) - 5;
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
