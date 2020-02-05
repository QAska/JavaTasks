/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter c:");
        c = in.nextInt();

        z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}
