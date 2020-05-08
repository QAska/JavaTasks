public class studentSchedule {
    private Day currentDay;
    private Season currentSeason;

    studentSchedule(Day day, Season season) {
        currentDay = day;
        currentSeason = season;
    }

    public Day getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(Day currentDay) {
        this.currentDay = currentDay;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void goToUniversity(String name) {
        if (this.currentSeason == Season.SUMMER) {
            System.out.println(name + "! " + getCurrentSeason() + " is the time to relax!");
        } else if (this.getCurrentDay() == Day.SATURDAY || this.getCurrentDay() == Day.SUNDAY) {
            System.out.println(name + ", it's " + this.currentDay.title + ", the day of relax!");
        } else {
            System.out.println(name + ", it's " + this.currentDay.title + "! Go to University!");
        }
    }
}
