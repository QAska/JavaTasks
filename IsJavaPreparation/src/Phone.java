/*
Выбрать объект в помещении и создать класс с его именем. Добавить несколько конструкторов.
Наполнить класс полями и методами, которые описывают его свойства и поведение. Для полей добавить getter-ы, setter-ы.
Создать другой класс с main методом и в нём создать объект этого типа, заполнить поля, вызвать методы объекта.
Добавить в класс static метод и вызвать его в main-методе используя имя класса.
 */

public class Phone {

    private String model;
    private int ram;
    private double diagonal;
    private int pixel;

    public Phone(String model, int ram) {
        this.model = model;
        this.ram = ram;
    }

    public Phone(String model, int ram, double diagonal) {
        this.model = model;
        this.ram = ram;
        this.diagonal = diagonal;
    }

    public void phoneDescription(String model, int ram) {
        System.out.println("" +
                "Phone model is " + model + ". " +
                "Ram = " + ram + ". ");
    }

    public void phoneDescription(String model, int ram, double diagonal) {
        System.out.println("" +
                "Phone model is " + model + ". " +
                "Ram = " + ram + ". " +
                "Diagonal = " + diagonal + ".");
    }

    public void phoneRings() {
        System.out.println("Phone is ringing!");
    }

    public void phoneCalls() {
        System.out.println("Phone is calling!");
    }

    public static void alarmRings() {
        System.out.println("Alarm!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}