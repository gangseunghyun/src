package DAY03;

/*
계산기 생성

숫자 1 입력 : 5
숫자 2 입력 :1
연산자 입력 : +
결과값 : 6 입니다.

연산자 +,-,*,% 외의 것이 나오면 [잘못된 연산자입니다.]
소숫점 첫자리까지 출력

1. 입력준비
2. 변수자리
3. 변수생성
3-1. 변수 비교 - switch or equals
4. 결과값 출력

 */


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        System.out.print("숫자 1 입력 : "); // 숫자1 입력
        int num1 = scr.nextInt();

        System.out.print("숫자 2 입력 : "); // 숫자2 입력
        int num2 = scr.nextInt();

        System.out.print("연산자 입력 : "); // 연산자 입력
        String opr = scr.next();

        if (opr.equals("+")){ // if의 조건문에는 ; 안들어감. 명령문에만 들어감
            System.out.print("결과값 : "+(num1+num2)+"입니다");
        }
        else if (opr.equals("-")){
            System.out.println("결과값 : "+(num1-num2)+"입니다");
        }
        else if (opr.equals("/")) {
             double division = (double) num1/num2; //num은 int기 때문에 형변환을 꼭 해야함!
            System.out.printf("결과값 : %.1f 입니다",division); //(double)num1/(num2)로 하면 num1이 더블이 되면서 num2와 나눌때 더블이 됨.
        } //(double)(num1/num2)가 왜 안됨?
        else if (opr.equals("*")) {
            System.out.println("결과값 : "+(num1*num2)+"입니다");
        }
        else System.out.println("잘못된 연산자 입니다.");


    }
}
