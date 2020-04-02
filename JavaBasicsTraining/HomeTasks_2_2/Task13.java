/*
Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
 */

public class Task13 {
    public static void main(String[] args) {
        double y;
        double a = -5;
        double b = 5;
        double k = 0.5;

        for (double x = a; x <= b; x += k) {
            y = 5 - Math.pow(x, 2) / 2;
            System.out.println("x = " + x + ", y =" + y);
        }
    }
}
