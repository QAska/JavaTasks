/*
Дано натуральное n. вычислить:
1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int n;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextInt();

        res = 0;
        for (int i = 1; i <= n; i++) {
            res += 1/ (float) i;
        }

        System.out.println(res);
    }
}
