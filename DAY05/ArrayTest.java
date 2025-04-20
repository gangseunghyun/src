package DAY05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new  int[5];

        for (int i = 0;i<5;i++){
            System.out.println("a["+i+"] : "+a[i]); // i : index, a[i] : value
        }

      //  int b [] = new  int[5];

        int[] kor = new int[100];

        for (int i = 0; i<100 ; i++){
            kor[i] = i + 1;
        }

        for (int i = 0; i<100; i++){
            System.out.println("kor["+i+"] : "+kor[i]);
        }
        for (int i = 0;i<5;i++){
            a[i] = 10*(i+1);
        }
        for (int i = 0; i<5;i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
    }
}
