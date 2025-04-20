package Day05_T;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            // a[0]
            System.out.println("a[" + i + "] : " + a[i]); //i : index, a[i] : value
        }

        //  int b[] = new int[5]; //가능은 하지만 추천 X

        int[] kor = new int[100];

        /*
         * b 의 방 5개 에 1,3,5,7,9를 넣어주세요!
         * */
        int[] b = new int[5];
        /*
        b[0] = 1;
        b[1] = 3;
        b[2] = 5;
        b[3] = 7;
        b[4] = 9;
        */
//        for (int i =0; i<5 ; i++){
//            b[i] = 2*i + 1;
//        }
        int g[] = new int[10];
        int h[] = new int[5];

        for (int i = 0; i < 10; i++) {

//            g[i] = 2 * i + 1;
//            g[i + 5] = (2 * i + 11);
//            g[i + 5] = g[i]+10;
           h[i%5] = i%5 + 1;
//            - + * / % & ||
        }
// 01234 56789 -5 %i 01234  1%5=0.2 ->2


        System.out.println(3%5);

        for (int i =0; i<5 ; i++){
            b[i] = 0;
           for (int j = 0; j<=i; j++){
               b[i] = b[i]*10+1;

           }
            System.out.println("b[출력]" + b[i]);
        }

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
       // int g = 50;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
