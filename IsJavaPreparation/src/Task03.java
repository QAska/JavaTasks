/*
Создать интерфейс, который описывает работу тестера: QA. Наполнить его методами. Добавить default метод с реализацией.
Создать 2 класса, которые наследуют этот интерфейс: ManualQA и AutomateQA, реализовать методы интерфейса.
Создать класс, который наследуется от одного из этих классов, переопределить в нём какой-нибудь метод.
В main-методе создать объекты всех этих созданных классов и вызвать у них методы.
 */

public class Task03 {

    public static void main(String[] args) {

        ManualQA manualQA = new ManualQA();
        AutomateQA automateQA = new AutomateQA();
        IntraManualQA intraManualQA = new IntraManualQA();

        manualQA.writeCheckList();
        manualQA.testExecution();
        manualQA.writeTestCase();
        manualQA.testExecution();
        manualQA.bugSubmit();
        manualQA.bugVerification();
        manualQA.testReporting();
        manualQA.meetingParticipate();

        System.out.println();

        automateQA.writeCheckList();
        automateQA.testExecution();
        automateQA.writeTestCase();
        automateQA.testExecution();
        automateQA.bugSubmit();
        automateQA.bugVerification();
        automateQA.testReporting();
        automateQA.meetingParticipate();

        System.out.println();

        intraManualQA.writeCheckList();
        intraManualQA.testExecution();
        intraManualQA.writeTestCase();
        intraManualQA.testExecution();
        intraManualQA.bugSubmit();
        intraManualQA.bugVerification();
        intraManualQA.testReporting();
        intraManualQA.meetingParticipate();
    }
}


