package DAY03;

/*
계산기 생성

숫자 1 입력 : 5
숫자 2 입력 :1
연산자 입력 : +
결과값 : 6 입니다.

연산자 +,-,*,/ 외의 것이 나오면 [잘못된 연산자입니다.]
소숫점 첫자리까지 출력

1. 입력준비
2. 변수자리
3. 변수생성
3-1. 변수 비교 - switch or equals
4. 결과값 출력

 */

import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력 : ");
        String op = sc.next();

        switch (op){
            case "+":
                System.out.println("결과값 : "+(num1+num2)+"입니다.");
                break;

            case "-":
                System.out.println("결과값 : "+(num1-num2)+"입니다.");
                break;

            case "*":
                System.out.println("결과값 : "+(num1*num2)+"입니다.");
                break;

            case "/":
                double i = (double) num1/num2;
                System.out.printf("결과값 : %.1f입니다.",i);
                break;

            default:
                System.out.println("잘못된 연산자입니다,");
                break;
        }


    }
}
