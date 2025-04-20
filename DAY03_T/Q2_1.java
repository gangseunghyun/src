package DAY03_T;

import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String op = sc.next();
        //2. 출력
        if(op.equals("+")){
            System.out.println("결과 값 : "+(num1+num2)+"입니다.");
        }
        else if(op.equals("-")){
            System.out.println("결과 값 : "+(num1-num2)+"입니다.");
        }
        else if(op.equals("*")){
            System.out.println("결과 값 : "+(num1*num2)+"입니다.");
        }
        else if (op.equals("/")) {
            System.out.printf("결과 값 : %.1f입니다.",(double)num1/num2);
        }
        else{
            System.out.println("잘못된 연산자 입니다.");
        }
    }
}
