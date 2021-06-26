/*
Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double angle;
        double gradDouble, minDouble, secDouble;
        int grad, min, sec;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter angle (radians):");
        angle = in.nextDouble();

        // 180 поделить на Пи и умножить на количество радиан = число с дробной частью, где целое — это кол-во градусов.
        gradDouble = 180 / Math.PI * angle;
        grad = (int)gradDouble;

        // Чтобы получить минуты, нужно дробную часть умножить на 60. Целая часть будет равна количеству минут.
        minDouble = (gradDouble - grad) * 60;
        min = (int)minDouble;

        // Снова умножаем дробную часть от предыдущей операции на 60, округляем до целого - получаем количество секунд.
        secDouble = (minDouble - min) * 60;
        sec = (int)Math.round(secDouble);

        System.out.println(grad + "gr, " + min + "min, " + sec + "sec");
    }
}
