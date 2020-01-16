public class DataOnlyPrint {
    int i = 47;
    double d = 1.1;
    boolean b = false;

    public static void main(String[] args){
        DataOnlyPrint data = new DataOnlyPrint();
        data.i = 48; // ???????????
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);

    }
}
