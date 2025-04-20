package Day02;

/*
숫자 2개를 입력하여
더하기 빼기 만드세요

1.스캐너로 입력준비
2.입력할 자리 만들기
3.변수 설정
4.결과값 출력
 */


import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in); // 입력준비
        System.out.print("숫자1 : "); // 입력할 자리 마련
        int a = scr.nextInt(); // 내가 입력할 변수
        System.out.print("숫자2 : "); //입력할 자리 마련
        int b = scr.nextInt();  // 내가 입력할 변수

        // 숫자 입력 후 결과 값

        System.out.println("더하기 값 : "+(a+b));
        System.out.println("빼기 값 : "+(a-b));



    }
}
