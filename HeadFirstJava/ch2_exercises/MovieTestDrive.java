package HeadFirst.ch2_exercises;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        one.title = "Потерянные в Офисе";
        one.genre = "Комедия";
        one.rating = 5;
        two.playIt();

        Movie three = new Movie();
        one.title = "Байт-Клуб";
        one.genre = "Трагедия, но в целом весёлая";
        one.rating = 127;
    }
}