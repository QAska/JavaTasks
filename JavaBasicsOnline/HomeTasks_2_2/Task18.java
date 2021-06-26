/*Даны числовой ряд и некоторое число е.
Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид: an = (-1)^(n-1)/n.
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int n;
        double m;
        double e;
        double sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n:");
        n = in.nextInt();
        System.out.println("Enter double e:");
        e = in.nextDouble();

        for (double i = 1; i <= n; i++){
            m = Math.pow(-1, i - 1) / i;

            if (Math.abs(m) >= e) {
                sum += m;
            }
        }

        System.out.println(sum);
    }
}
