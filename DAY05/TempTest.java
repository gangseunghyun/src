package DAY05;

public class TempTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);


    }
}
