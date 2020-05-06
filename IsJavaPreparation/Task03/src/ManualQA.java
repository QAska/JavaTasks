public class ManualQA implements TesterQA {

    public void writeCheckList() {
        System.out.println("ManualQA: I am writing check list in Excel!");
    };

    public void writeTestCase() {
        System.out.println("ManualQA: I am writing test case in TestRail!");
    }

    public void testExecution() {
        System.out.println("ManualQA: I am testing manually!");
    }

    public void bugSubmit() {
        System.out.println("ManualQA: Bug submitted in Jira!");
    }

    public void bugVerification() {
        System.out.println("ManualQA: Bug verified manually!");
    }

    public void testReporting() {
        System.out.println("ManualQA: I am writing test report in Word!");
    }
}
