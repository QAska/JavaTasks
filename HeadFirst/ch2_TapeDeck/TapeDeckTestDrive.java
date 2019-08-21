package HeadFirst.ch2_TapeDeck;

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();

        t.canRecord = false;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
