/*
Составить программу, реализующую эпизод применения компьютера в книжном магазине.
Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
* если сдачи не требуется, печатает на экране «спасибо»;
* если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи;
* если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        double price, given;
        double dif;

        Scanner in = new Scanner(System.in);
        System.out.println("Стоимость книги:");
        price = in.nextDouble();
        System.out.println("Покупатель дал:");
        given = in.nextDouble();

        if (price == given) {
            System.out.println("спасибо");
        }
        else if (given > price) {
            dif = given - price;
            System.out.println("возьмите сдачу " + dif);
        }
        else {
            dif = price - given;
            System.out.println("нужно доплатить " + dif);
        }
    }
}
