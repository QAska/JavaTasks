/*
Создать класс RepkaPuller с полями `имя` и `порядковый номер в цепи`.
В main-методе создать ArrayList, добавить в его объекты мышки, кошки, жучки, внучки, бабки, дедки, бэтмена,
заполняя поле `порядковый номер в цепи` в случайном порядке.
Отсортировать ArrayList по порядковому номеру, используя Comparator. Вывести в консоль.
Удалить из листа лишнего персонажа.
Создать из этого листа - HashSet. Добавить в Set бетмена.
Удалить из Set-a всех, у кого `порядковый номер в цепи` больше 3.
Создать HashMap<String, Integer>, заполнить его данными из предыдущего ArrayList-а,
где ключ - имя, значение - порядковый номер в цепи.
 */

import java.util.*;

public class Task08 {
    public static void main(String[] args) {
        ArrayList<RepkaPuller> repkaQueue = new ArrayList<>();

        RepkaPuller mouse = new RepkaPuller();
        mouse.setName("Мышка");
        mouse.setOrder(1);
        repkaQueue.add(0, mouse);

        RepkaPuller cat = new RepkaPuller();
        cat.setName("Кошка");
        cat.setOrder(2);
        repkaQueue.add(0, cat);

        RepkaPuller dog = new RepkaPuller();
        dog.setName("Жучка");
        dog.setOrder(3);
        repkaQueue.add(0, dog);

        RepkaPuller girl = new RepkaPuller();
        girl.setName("Внучка");
        girl.setOrder(4);
        repkaQueue.add(0, girl);

        RepkaPuller grandMother = new RepkaPuller();
        grandMother.setName("Бабка");
        grandMother.setOrder(5);
        repkaQueue.add(0, grandMother);

        RepkaPuller grandFather = new RepkaPuller();
        grandFather.setName("Дедка");
        grandFather.setOrder(6);
        repkaQueue.add(0, grandFather);

        RepkaPuller batman = new RepkaPuller();
        batman.setName("Бэтмэн");
        batman.setOrder(0);
        repkaQueue.add(0, batman);

        System.out.println("Изначально неотсортированная последовательность:");
        for (int i = 0; i < repkaQueue.size(); i++) {
            System.out.print(repkaQueue.get(i).getName() + " ");
        }
        System.out.println();
        System.out.println();

        Collections.reverse(repkaQueue);
        System.out.println("Отсортировано в обратном порядке по номерам с помощью compareTo():");
        for (int i = 0; i < repkaQueue.size(); i++) {
            System.out.print(repkaQueue.get(i).getName() + " ");
        }
        System.out.println();
        System.out.println();

        Comparator memberComparator = new RepkaMemebersComparator();
        Collections.sort(repkaQueue, memberComparator);

        System.out.println("Отсортировано по номерам с помощью Comparator:");
        for (int i = 0; i < repkaQueue.size(); i++) {
            System.out.print(repkaQueue.get(i).getName() + " ");
        }
        System.out.println();
        System.out.println();

        repkaQueue.remove(0);
        System.out.println("Удалили Бэтмена:");
        for (int i = 0; i < repkaQueue.size(); i++) {
            System.out.print(repkaQueue.get(i).getName() + " ");
        }
        System.out.println();
        System.out.println();

        HashSet<RepkaPuller> repkaSet = new HashSet<>(repkaQueue);
        repkaSet.add(batman);
        System.out.println("Печатаем Set с Бэтменом:");
        for (RepkaPuller setElement : repkaSet) {
            System.out.print(setElement.getName() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Удаляем из Set всех, у кого `порядковый номер в цепи` больше 3.");
        for (Iterator<RepkaPuller> iterator = repkaSet.iterator(); iterator.hasNext(); ) {
            RepkaPuller s = iterator.next();
            if (s.getOrder() > 3) {
                iterator.remove();
            }
        }

        for (RepkaPuller setElement : repkaSet) {
            System.out.print(setElement.getName() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Создаём HashMap<String, Integer> из ArrayList-а, где ключ - имя, значение - номер.");
        HashMap<String, Integer> repkaMap = new HashMap<>();
        for (RepkaPuller mapElement : repkaQueue) {
            repkaMap.put(mapElement.getName(), mapElement.getOrder());
        }

        for (String name: repkaMap.keySet()){
            String key = name.toString();
            String value = repkaMap.get(name).toString();
            System.out.print(key + " - " + value + "; ");
        }

    }
}
