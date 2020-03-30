/*
Даны целые числа m, n.
Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных,
а если равны, то заменить числа нулями.
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int m, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter m:");
        m = in.nextInt();
        System.out.println("Enter n:");
        n = in.nextInt();

        if (m == n) {
            m = 0;
            n = 0;
        }
        else {
            if (m > n) {
                n = m;
            }
            else {
                m = n;
            }
        }
        System.out.println(m + ", " + n);
    }
}
