/*
Два двузначных числа, записанных одно за другим, образуют четырёхзначное число,
которое делится на их произведение. Найти эти числа.
 */

public class Task36 {
    public static void main(String[] args) {
        int combine;
        int mult;

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                combine = i * 100 + j;
                mult = i * j;
                if (combine % mult == 0) {
                    System.out.println(i + ", " + j);
                }
            }
        }

    }
}
