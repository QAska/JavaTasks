/*
Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам.
*/

public class TriangleHypotenuseAndArea {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double s;

        a = 3;
        b = 5;
        c = Math.sqrt(a * a + b * b);
        s = 0.5 * a * b;

        System.out.println("Hypotenuse = " + c);
        System.out.println("Area = " + s);
    }
}
