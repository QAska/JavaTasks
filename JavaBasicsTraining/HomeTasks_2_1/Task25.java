/*
Написать программу — модель анализа пожарного датчика в помещении,
которая выводит сообщение «Пожароопасная ситуация», если температура в комнате превысила 60° С.
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        double c;

        Scanner in = new Scanner(System.in);
        System.out.print("Какая температура? > ");
        c = in.nextDouble();

        if (c > 60) {
            System.out.println("Пожароопасная ситуация");
        }
    }
}
