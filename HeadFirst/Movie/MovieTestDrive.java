package HeadFirst.Movie;

class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        one.title = "Потерянные в офисе";
        one.genre = "Комедия";
        one.rating = 5;
        two.playIt();
        Movie three = new Movie();
        one.title = "Байт-клуб";
        one.genre = "Трагедия, но в целом весёлая";
        one.rating = 127;
    }
}