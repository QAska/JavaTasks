/*
Программа — льстец. На экране высвечивается вопрос «Кто твой любимый питомец: кошка или собака? Введи К или С».
В зависимости от ответа на экране должен появиться текст «Мне нравятся кошки!» или «Мне нравятся собаки!».
 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        String str;
        char gender;

        Scanner in = new Scanner(System.in);
        System.out.print("Кто твой любимый питомец: кошка или собака? Введи К или С: ");

        while (!in.hasNext("[КС]")) {
            System.out.print("Введи К или С! Попробуй ещё раз: ");
            in.next();
        }

        str = in.next();
        gender = str.charAt(0);

        if (gender == 'К') {
            System.out.println("Мне нравятся кошки!");
        }
        else {
            System.out.println("Мне нравятся собаки!");
        }
    }
}
