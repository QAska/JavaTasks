/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
e.	Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
f.	Треугольник со сторонами а,b,с является равнобедренным.
g.	Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
h.	Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
i.	График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n).
 */

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task37_5 {
    public static void main(String[] args) {
        int n;
        double sq, cube;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3-digits number:");
        n = in.nextInt();

        sq = Math.pow(n, 2);
        System.out.println(sq);
        sum = 0;
        while (n !=0) {
            sum += n % 10;
            n = n / 10;
        }

        cube = Math.pow(sum, 3);
        System.out.println(cube);

        if (sq == cube) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
