/*
Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *).
•	Вычислить результат Z в зависимости от знака.
    Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y = 0 при делении.
•	Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл).
•	В качестве символа прекращения вычислений принять ‘0’.
 */

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double x, y;
        boolean process;
        char oper;
        double res = 0;

        Scanner in = new Scanner(System.in);

        process = true;
        while (process) {
            System.out.println("Enter double X:");
            x = in.nextDouble();
            System.out.println("Enter double Y:");
            y = in.nextDouble();

            System.out.println("Enter operation:");
            in.nextLine();
            oper = in.next().charAt(0);

            switch (oper) {
                case '+':
                    res = x + y;
                    System.out.println(res);
                    break;
                case '-':
                    res = x - y;
                    System.out.println(res);
                    break;
                case '*':
                    res = x * y;
                    System.out.println(res);
                case '/':
                    if (y == 0) {
                        System.out.println("Division by zero!");
                    }
                    else {
                        res = x / y;
                        System.out.println(res);
                    }
                    break;
                case '0':
                    System.out.println("Exit");
                    process = false;
                    break;
                default:
                    System.out.println("Wrong operator!");
            }
        }


    }
}
