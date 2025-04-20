package Day05_T;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];

        for(int i =0;i<5;i++){
            // a[0]
            System.out.println("a["+i+"] : "+a[i]); //i : index, a[i] : value
        }

        int b[] = new int[5]; //가능은 하지만 추천 X

        int[] kor = new int[100];

        for(int i = 0;i<100;i++){
            kor[i] = i + 1;
        }

        for(int i = 0;i<100;i++){
            System.out.println("kor["+i+"] : " + kor[i]);
        }

        for(int i = 0;i<5;i++){
            a[i] = 10*(i+1);
        }
        for(int i = 0;i<5;i++){
            System.out.println("a["+i+"] : "+a[i]);
        }

        int c = 10;
        int d = 20;
        int e = 30;
        int f = 40;
        int g = 50;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
