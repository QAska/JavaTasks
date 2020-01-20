public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow all = new AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(27);
    }
}
