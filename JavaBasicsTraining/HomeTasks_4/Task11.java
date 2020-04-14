/*
Даны натуральные числа а1 ,а2 ,..., аn. Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int n;
        int m;
        int l;
        int[] array;
        String message;

        message = "Enter size of the array, integer number > 0: ";
        n = getNumber(message);
        array = new int[n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        message = "Enter divider, integer number > 0: ";
        m = getNumber(message);
        message = "Enter remainder of the division, integer number > 0: ";
        l = getNumber(message);

        System.out.println("Array with condition: ");
        printRestrictedArray(array, m, l);


    }

    public static void printRestrictedArray(int[] array, int m, int l) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == l) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
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
            array[i] = random.nextInt(100);
        }
    }

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print(message);
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 1);

        return z;
    }
}
