/*
Найти (в радианах и в градусах) все углы треугольника со сторонами а, b, с.
 */

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double a, b, c;
        double radAlpha, radBeta, radGamma;
        double gradDouble, minDouble, secDouble;
        int angleGradAlpha, angleMinAlpha, angleSecAlpha;
        int angleGradBeta, angleMinBeta, angleSecBeta;
        int angleGradGamma, angleMinGamma, angleSecGamma;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        // Вычисляем первый угол
        radAlpha = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        System.out.println("Radian = " + radAlpha);

        // 180 поделить на Пи и умножить на количество радиан = число с дробной частью, где целое — это кол-во градусов.
        // Чтобы получить минуты, нужно дробную часть умножить на 60. Целая часть будет равна количеству минут.
        // Снова умножаем дробную часть от предыдущей операции на 60, округляем до целого - получаем количество секунд.
        gradDouble = 180 / Math.PI * radAlpha;
        angleGradAlpha = (int)gradDouble;

        minDouble = (gradDouble - angleGradAlpha) * 60;
        angleMinAlpha = (int)minDouble;

        secDouble = (minDouble - angleMinAlpha) * 60;
        angleSecAlpha = (int)Math.round(secDouble);

        // Вычисляем второй угол
        radBeta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
        System.out.println("Radian = " + radBeta);

        gradDouble = 180 / Math.PI * radBeta;
        angleGradBeta = (int)gradDouble;

        minDouble = (gradDouble - angleGradBeta) * 60;
        angleMinBeta = (int)minDouble;

        secDouble = (minDouble - angleMinBeta) * 60;
        angleSecBeta = (int)Math.round(secDouble);

        // Вычисляем третий угол
        radGamma = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
        System.out.println("Radian = " + radGamma);

        gradDouble = 180 / Math.PI * radGamma;
        angleGradGamma = (int)gradDouble;

        minDouble = (gradDouble - angleGradGamma) * 60;
        angleMinGamma = (int)minDouble;

        secDouble = (minDouble - angleMinGamma) * 60;
        angleSecGamma = (int)Math.round(secDouble);

        System.out.println("Первый угол = " + angleGradAlpha + "gr, " + angleMinAlpha + "min, " + angleSecAlpha + "sec");
        System.out.println("Второй угол = " + angleGradBeta + "gr, " + angleMinBeta + "min, " + angleSecBeta + "sec");
        System.out.println("Третий угол = " + angleGradGamma + "gr, " + angleMinGamma + "min, " + angleSecGamma + "sec");
    }
}
