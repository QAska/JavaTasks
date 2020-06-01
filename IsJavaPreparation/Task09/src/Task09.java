/*
В main-методе создать Stream из ArrayList-a (используя .stream()),
создать следующий Stream (используя Stream.of),
создать Stream из массива (используя Arrays.stream).
(Можно вынести все это в отдельный метод, который  позовётся из main-a).
Создать класс RepkaPuller с полями `имя`, `сила`: число от 1 до 10,
`тип персонажа`: тип Enum-a, в котором перечислены: СКАЗКА, КОМИКС.
В main-методе создать ArrayList, добавить в его объекты мышки, кошки, жучки, внучки, бабки, дедки, бэтмена.
(У Бэтмэна `тип персонажа` - комикс, у остальных - сказка).
Используя Stream API:
Рассчитать ArrayList со списком СКАЗОЧНЫХ персонажей.
Рассчитать кол-во КОМИКС-персонажей.
Разделить коллекцию на персонажей сказочных и комиксовых (используя partitioningBy, groupingBy)
Рассчитать среднюю силу персонажа.
Найти максимальную силу персонажа.
Найти общую силу персонажей.
Получить List 3-ёх самых сильных персонажей.
Узнать, если в списке 15 персонаж с порядковым номером 17.
Найти любого персонажа, у которого сила больше 5.
Вернуть список имён персонажей.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task09 {
    public static void main(String[] args) {
        ArrayList<RepkaPuller> repkaQueue = new ArrayList<>();

        RepkaPuller mouse = new RepkaPuller();
        mouse.setName("Мышка");
        mouse.setPower(1);
        mouse.setType(Type.FAIRYTALE);
        repkaQueue.add(0, mouse);

        RepkaPuller cat = new RepkaPuller();
        cat.setName("Кошка");
        cat.setPower(2);
        cat.setType(Type.FAIRYTALE);
        repkaQueue.add(0, cat);

        RepkaPuller dog = new RepkaPuller();
        dog.setName("Жучка");
        dog.setPower(3);
        dog.setType(Type.FAIRYTALE);
        repkaQueue.add(0, dog);

        RepkaPuller girl = new RepkaPuller();
        girl.setName("Внучка");
        girl.setPower(4);
        girl.setType(Type.FAIRYTALE);
        repkaQueue.add(0, girl);

        RepkaPuller grandMother = new RepkaPuller();
        grandMother.setName("Бабка");
        grandMother.setPower(5);
        grandMother.setType(Type.FAIRYTALE);
        repkaQueue.add(0, grandMother);

        RepkaPuller grandFather = new RepkaPuller();
        grandFather.setName("Дедка");
        grandFather.setPower(6);
        grandFather.setType(Type.FAIRYTALE);
        repkaQueue.add(0, grandFather);

        RepkaPuller batman = new RepkaPuller();
        batman.setName("Бэтмэн");
        batman.setPower(10);
        batman.setType(Type.COMICBOOK);
        repkaQueue.add(0, batman);


        Type types[] = Type.values();
        for(Type type: types) {
            System.out.println("Имя типа " + type + ": " + type.getType());
        }

        Stream stream = repkaQueue.stream();

        long count = repkaQueue
                .stream().filter(c -> c.getType() == Type.FAIRYTALE)
                .count();

        System.out.println("Количество сказочных персонажей: " + count);
    }

    public static void streamExample() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();

        Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array);
    }
}
