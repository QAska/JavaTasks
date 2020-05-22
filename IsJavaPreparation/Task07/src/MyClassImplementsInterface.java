public class MyClassImplementsInterface implements MyInterfaceException {
    @Override
    public void display(int n) throws MyClassException{
        if (n < 0) {
            throw new MyClassException("n < 0 exception!");
        } else {
            System.out.println("This is the implementation of the display() method from MyClassImplementsInterface class.");
        }
    }
}
