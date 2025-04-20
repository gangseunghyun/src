package Day05_T;

public class TempTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        /*
        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);

         */
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
