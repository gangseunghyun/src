package Day06_T;

/*
두 수를 입력 받아서 최대공약수 최소공배수 구하기
유클리드 호제법

 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    /*
         120 36
         12 = 120 % 36
         0  =  36  % 12(최대공약수)
         나머지가 0이나오면 최대 공약수가 구해집니다.
     */
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        int r;
        while(true){
              // 12 = 120 % 36
              // 0   =  36 % 12
              r = a % b;
              if(r == 0){
                  break;
              }
              a = b; // a = 36 12
              b = r; // b = 12  0

        }
//        r = 1;
//        while(r > 0){
//            r = a % b;
//            a = b; // a = 36 12
//            b = r; // b = 12  0
//        }


        System.out.println("최대공약수 : "+ b);
        System.out.println("최소공배수 : "+(num1*num2)/b);
    }
}
