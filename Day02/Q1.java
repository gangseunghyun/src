package Day02;

import java.util.Scanner;

/*
숫자 2개를 입력 받아서
더하기 빼기 결과 값을
출력을 하는 프로그램을
만드세요.

1. 숫자 2개 입력
2. 더하기 연산 출력
3. 빼기 연산 출력

입력 -> Scanner
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//입력준비
        //숫자 1입력
        System.out.print("숫자 1입력 : "); // 출력
        int num1 = sc.nextInt(); // 정수 입력 받아서 변수 num1에 대입
        //숫자 2입력
        System.out.print("숫자 2입력 : ");
        int num2 = sc.nextInt();
        //더하기 결과 출력
        System.out.println("더하기 결과 값 출력 : "+(num1 + num2));
        //빼기 결과 출력
        System.out.println("빼기 결과 값 출력 : "+(num1 - num2));

    }
}
