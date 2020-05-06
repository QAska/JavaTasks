public class IntraManualQA extends ManualQA {

    @Override
    public void bugSubmit() {
        System.out.println("IntraManualQA: Bug submitted in Version One!");
    }

    @Override
    public void bugVerification() {
        System.out.println("IntraManualQA: Bug has been discussed and verified several times on several environments!");
    }
}
