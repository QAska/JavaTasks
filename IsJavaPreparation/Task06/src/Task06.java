/*
Создать Enum. Создать ещё один Enum с переменными. Создать класс с 2 полями типов первого и второго Enum.
В main-методе создать объект этого класса и заполнить его поля.
 */

public class Task06 {
    public static void main(String[] args) {
        String name = "Ivan";
        String currentDay = "MONDAY";
        String season = "WINTER";

        studentSchedule schedule = new studentSchedule(Day.valueOf(currentDay), Season.valueOf(season));

        schedule.goToUniversity(name);

        schedule.setCurrentDay(Day.SATURDAY);

        schedule.goToUniversity(name);

        schedule.setSeason(Season.SUMMER);

        schedule.goToUniversity(name);
    }
}
