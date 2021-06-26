/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
d.	Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х = m, х = n (m < n).
e.	Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
f.	Треугольник со сторонами а,b,с является равнобедренным.
g.	Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
h.	Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
i.	График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n).
 */

import java.util.Scanner;

public class Task37_4 {
    public static void main(String[] args) {
        int x, y;
        int m, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();
        System.out.println("Enter m:");
        m = in.nextInt();
        System.out.println("Enter n:");
        n = in.nextInt();

        if ((x > m) && (x <= n)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
