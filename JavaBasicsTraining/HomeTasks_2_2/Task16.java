/*
Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

public class Task16 {
    public static void main(String[] args) {
        long res = 1;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            res *= sum;
        }

        System.out.println(res);
    }
}
