package TaeHyun;
/*
정수 A, B 를 입력받아서
A가 B의 배수이면 "A가 B의 배수입니다." 아니면 "A가 B의 배수가 아닙니다" 를 출력 해주세요

입출력 예
A   B   출력
98   2   "A가 B의 배수입니다."
34   3   "A가 B의 배수가 아닙니다"

1. 정수인 변수 2개 입력
2. if else로 두가지 결과값 출력
2-1 배수는 %연산자 사용
 */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 && num1 > num2){
            System.out.println(num1+"이 "+num2+"의 배수입니다.");
        }
        else System.out.println(num1+"이 "+num2+"의 배수가 아닙니다.");
    }
}
