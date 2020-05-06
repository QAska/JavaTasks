public class AutomateQA implements TesterQA{

    public void writeCheckList() {
        System.out.println("AutomateQA: I am writing check list in Notepad++!");
    };

    public void writeTestCase() {
        System.out.println("AutomateQA: I am writing test case on Gherkin!");
    }

    public void testExecution() {
        System.out.println("AutomateQA: I am testing automatically!");
    }

    public void bugSubmit() {
        System.out.println("AutomateQA: Bug submitted automatically in Jira!");
    }

    public void bugVerification() {
        System.out.println("AutomateQA: Bug verified by automated run!");
    }

    public void testReporting() {
        System.out.println("AutomateQA: I am checking test report in Allure!");
    }
}
