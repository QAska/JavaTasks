/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(sinx + cosy) / (cosx − siny) ∗ tgxy
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String args[]) {
        Double x, y, res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Result = "+ res);
    }
}
