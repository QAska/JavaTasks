/*
Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        int n;
        int digit1, digit2, digit3, digit4;
        int dif;
        boolean flag;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n:");
        n = in.nextInt();

        digit1 = n % 10;
        digit2 = n / 10 % 10;
        dif = digit1 - digit2;
        n /= 10;

        flag = false;
        while (n > 10) {
            digit3 = n % 10;
            digit4 = n / 10 % 10;
            if (digit3 - digit4 == dif) {
                flag = true;
            } else {
                flag = false;
            }
            n /= 10;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
