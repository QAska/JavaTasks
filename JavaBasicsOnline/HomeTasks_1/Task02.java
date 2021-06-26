/*
Найдите значение функции: с = 3 + а.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int a;
        int c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();

        c = 3 + a;

        System.out.println("c = " + c);
    }
}
