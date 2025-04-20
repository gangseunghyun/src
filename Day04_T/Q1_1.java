package Day04_T;

/*
숫자 입력 : 10
짝수 : 2 4 6 8
홀수 : 1 2 5 7 9
프로그램 구현
1. 입력
2. 출력 -> 짝수 홀수 구분해서 출력
 */

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        //2. 출력
        //2-1 짝수 출력
        System.out.print("짝수 : ");
        for(int i = 1;i<num;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //2-2 홀수 출력
        System.out.print("홀수 : ");
        for(int i = 1;i<num;i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
