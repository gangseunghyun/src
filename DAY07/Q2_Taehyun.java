package DAY07;

import java.util.Scanner;
public class Q2_Taehyun {

    static int aa;
    static int bb;

    static int sum(int a, int b){
        return a+b;
    }

    static void m(int a,int b){
        System.out.println(a-b);
    }

    static String gop (int a,int b){
        return a*b+"";
    }

    static void division(){
        System.out.println(aa/bb);
    }


    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        /*
        * 두개의 숫자를 입력받앙
        * 메소드 4개를 만들어 주는데
        * 1. a+b
        * 2. a-b
        * 3. a*b
        * 4. a/b
        *

        * */
        a = sc.nextInt();
        b = sc.nextInt();

        aa = a;
        bb = b;




    }



}


