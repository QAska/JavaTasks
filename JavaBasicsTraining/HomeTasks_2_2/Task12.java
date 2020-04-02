/*
Последовательность аn строится так: а1 = 1, an = 6 + аn-1 , для каждого n > 1.
 Составьте программу нахождения произведения первых 10 членов этой последовательности.
 */

public class Task12 {
    public static void main(String[] args) {
        int temp = 1;
        long mult = 1;

        for (int n = 1; n <= 10; n++) {
            mult = mult * temp;
            temp += 6;
        }

        System.out.println(mult);
    }
}
