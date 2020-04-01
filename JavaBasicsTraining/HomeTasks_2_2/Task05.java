/*
С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
 */

public class Task05 {
    public static void main(String[] args) {
        int sum;
        int i;

        i = 1;
        sum = 0;
        while (i < 100) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
