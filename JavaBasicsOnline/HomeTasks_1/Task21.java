/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        double n, b;
        String c;
        int a;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextDouble();

        a = (int)n;
        b = (n - a) * 1000 + (double)a / 1000;
        c = new DecimalFormat("#0.000").format(b);
        System.out.println(c);
    }
}
