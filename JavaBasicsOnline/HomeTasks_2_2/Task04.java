/*
С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
 */

public class Task04 {
    public static void main(String[] args) {
        int x;

        x = 0;
        while (x != 100) {
            x += 2;
            System.out.print(x + " ");
        }
    }
}
