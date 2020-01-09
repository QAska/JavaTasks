package HeadFirst.ch1_exercises;

public class PhraseOMatic {
    public static void main(String[] args) {
        //Наборы слов для выбора
        String[] wordListOne = {"круглосуточный", "трёх-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределённый", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоёванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        //Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Выводим фразу на экран
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
