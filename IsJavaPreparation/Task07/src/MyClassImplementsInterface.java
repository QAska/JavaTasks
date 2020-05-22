public class MyClassImplementsInterface implements MyInterfaceException {
    public void displayException() throws MyClassException {
        int n = -1;

        if (n < 0) {
            throw new MyClassException("n < 0 exception!");
        } else {
            System.out.println("This is the implementation of the display() method from MyClassImplementsInterface class.");
        }
    }
}
