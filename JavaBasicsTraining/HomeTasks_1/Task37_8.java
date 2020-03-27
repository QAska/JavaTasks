/*
Составить линейную программу,
печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
h.	Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
 */

import java.util.Scanner;

public class Task37_8 {
    public static void main(String[] args) {
        double n;
        double a;
        boolean res = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        n = in.nextDouble();
        System.out.println("Enter a:");
        a = in.nextDouble();

        int i = 0;
        while (i <= 4) {
            if (Math.pow(a, i) == n) {
                res = true;
                break;
            } else {
                res = false;
            }
            i++;
        }

        System.out.println(res);

    }
}
