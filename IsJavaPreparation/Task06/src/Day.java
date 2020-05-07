public enum Day {
    MONDAY ("Monday", 1),
    TUESDAY ("Tuesday", 2),
    WEDNESDAY ("Wednesday", 3),
    THURSDAY ("Thursday", 4),
    FRIDAY ("Friday", 5),
    SATURDAY ("Saturday", 6) ,
    SUNDAY ("Sunday", 7);

    public final String title;
    public final int order;

    private Day(String title, int order) {
        this.title = title;
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public int getOrder() {
        return order;
    }
}
