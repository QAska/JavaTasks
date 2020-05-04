/*
Выбрать объект в помещении и создать класс с его именем. Добавить несколько конструкторов.
Наполнить класс полями и методами, которые описывают его свойства и поведение. Для полей добавить getter-ы, setter-ы.
Создать другой класс с main методом и в нём создать объект этого типа, заполнить поля, вызвать методы объекта.
Добавить в класс static метод и вызвать его в main-методе используя имя класса.
 */

public class Task02_1 {
}

class Phone {

    private String model;
    private int ram;
    private float diagonal;
    private int pixel;

    public Phone(String model, int ram, float diagonal, int pixel) {
        this.model = model;
        this.ram = ram;
        this.diagonal = diagonal;
        this.pixel = pixel;
    }

    public Phone(String model, int ram, float diagonal) {
        this.model = model;
        this.ram = ram;
        this.diagonal = diagonal;
    }

    public Phone() {
    }

    public void phoneRinging() {
        System.out.println("Phone is ringing!");
    }

    public void phoneCall() {
        System.out.println("Phone is calling!");
    }

    public void alarmRings() {
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

    public float getDiagonal() {
        return diagonal;
    }

    public void setModel(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getPixel() {
        return pixel;
    }

    public void setModel(int pixel) {
        this.pixel = pixel;
    }
}