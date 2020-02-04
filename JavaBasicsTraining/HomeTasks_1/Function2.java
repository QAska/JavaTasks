/*
Найдите значение функции: z = 2 * x + (y – 2) * 5.
 */

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();

        z = 2 * x + (y - 2) * 5;

        System.out.println("z = " + z);
    }
}
