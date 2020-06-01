public enum Type {
    FAIRYTALE("Сказка"),
    COMICBOOK("Комикс");

    public final String label;

    private Type(String label) {
        this.label = label;
    }

    public String getType() {
        return label;
    }
}
