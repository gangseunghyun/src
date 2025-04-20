package Day02;

import java.util.Scanner;
/*
숫자 2개를 입력하여
더하기 빼기 만드세요

1. 숫자1 입력하기
2. 숫자2 입력하기
3. 더하기값 출력
4. 빼기값 출력
 */



public class Q1 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int b = test.nextInt();

        System.out.print("숫자 입력 : ");
        int a = test.nextInt();
        System.out.println("입력한 값 더하기 : "+(a+b));
        System.out.println("입력한 값 빼기 : "+(a-b));

    }
}
