/*
Дано действительное число х. Не пользуясь никакими другими арифметическими операциями,
кроме умножения, сложения и вычитания, вычислите за минимальное число операций: 2x^4 - 3х^3 + 4х^2 - 5х + 6.
Разрешается использовать не более четырех умножений и четырех сложений и вычитаний (всего 8 операций).
 */

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        double x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        res = (((2 * x - 3) * x + 4) * x - 5) * x + 6;
        System.out.println(res);
    }
}
