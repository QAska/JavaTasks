/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
 */

public class Task26 {
    public static void main(String[] args) {
        char symbol;

        for (int i = 0; i <= Math.pow(2, 16) - 1; i++) {
            if (i % 80 == 0) {
                System.out.println();
            }
            symbol = (char) i;
            System.out.print(symbol);
        }
    }
}
