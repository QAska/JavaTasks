/*
Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */

public class Task34 {
    public static void main(String[] args) {
        int a, b, c, d;

        for (int i = 1000; i <= 9999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            d = i / 1000 % 10;
            if (a + b + c + d == 15) {
                System.out.println(i);
            }
        }
    }
}
