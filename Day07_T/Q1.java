package Day07_T;

import java.util.Scanner;

public class Q1 {
    static int a;
    static int b;
    //1. 더하기연산 주고받고
    static int sum(int a, int b){
        return a + b;
    }
    //2. 빼기연산 주고 안받고
    static int minus(){
        return a - b;
    }
    //3. 곱하기 연산 안주고 받고
    static void mul(int a,int b){
        System.out.println("결과 값 : "+(a*b)+"입니다.");
    }
    //4. 나누기 연산 안주고 안받고
    static void div(){
        System.out.printf("결과 값 : %.1f입니다.",(double)a/b);
    }

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
        switch (op){
            case "+":
                System.out.println("결과 값 : "+sum(num1,num2)+"입니다.");
                break;
            case "-":
                a = num1;
                b= num2;
                System.out.println("결과 값 : "+minus()+"입니다.");
                break;
            case "*":
                mul(num1,num2);
                break;
            case "/":
                a = num1;
                b = num2;
                div();
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }
    }
}
