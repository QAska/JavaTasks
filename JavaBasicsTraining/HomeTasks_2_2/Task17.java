/*
Даны действительное (а) и натуральное (n). Вычислить: a(a+1)...(a+n-1).
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        double a;
        int n;
        double res = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter double a:");
        a = in.nextDouble();
        System.out.println("Enter integer n:");
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            res *= (a + i);
        }

        System.out.println(res);
    }
}
