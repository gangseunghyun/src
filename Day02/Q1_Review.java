package Day02;

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


import java.util.Scanner;

public class Q1_Review {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt(); // 숫자1 입력 준비

        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.println("더하기 : "+(num1+num2));
        System.out.println("빼기 : "+(num1-num2));

    }
}
