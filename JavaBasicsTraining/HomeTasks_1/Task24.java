/*
Найти площадь равнобедренной трапеции с основаниями а и b и углом "альфа" при большем основании а.
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        double a;
        double b;
        double alpha;
        double s;
        double angle;
        double h;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter alpha:");
        alpha = in.nextDouble();

        // Угол alpha из градусной меры перевести в радианы: angle = alpha * pi / 180
        angle = alpha * Math.PI / 180;

        // Высота: h = (a - b) / 2 * tg(alpha)
        h = (a - b) / 2 * Math.tan(angle);

        // Площадь: S = (a + b) * h / 2, (a > b)
        s = (a + b) * h / 2;

        System.out.println("S = " + s);
    }
}
