/*
Создать Enum. Создать ещё один Enum с переменными. Создать класс с 2 полями типов первого и второго Enum.
В main-методе создать объект этого класса и заполнить его поля.
 */

public class Task06 {
    public static void main(String[] args) {
        String name;
        Day currentDay;
        Season currentSeason;

        name = "Ivan";
        currentDay = Day.MONDAY;
        currentSeason = Season.WINTER;

        studentSchedule schedule = new studentSchedule(currentDay, currentSeason);

        schedule.goToUniversity(name);

        currentDay = Day.SATURDAY;
        schedule.setCurrentDay(currentDay);

        schedule.goToUniversity(name);

        currentSeason = Season.SUMMER;
        schedule.setSeason(currentSeason);

        schedule.goToUniversity(name);
    }
}
