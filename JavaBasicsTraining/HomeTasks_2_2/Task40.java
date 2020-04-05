/*
Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
 */

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        int n;
        int num;
        int digit;
        int tmp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer N:");
        n = in.nextInt();

        for (int i = 10; i <= n; i++) {
            boolean flag = false;
            num = i;
            tmp = i;
            while (tmp != 0) {
                digit = tmp % 10;
                if (digit != 0 && digit != 1) {
                    if (num % digit == 0) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                tmp /= 10;
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
