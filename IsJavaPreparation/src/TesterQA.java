public interface TesterQA {

    public void writeCheckList();

    public void writeTestCase();

    public void testExecution();

    public void bugSubmit();

    public void bugVerification();

    public void testReporting();

    public default void meetingParticipate() {
        System.out.println("Tester: I'm wasting my time!");
    }
}