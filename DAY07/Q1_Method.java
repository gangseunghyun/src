package DAY07;

/*
계산기
숫자 2개
연산자 입력

메소드를 짜 놓고
메인에서 연산자를 입력하며 메소드가 불러와지는건가?

 */



import java.util.Scanner;

public class Q1_Method {
    static int mnum1;
    static int mnum2;

//주고 받고
    static int sum(int a,int b) { // 더하기일때
        return a+b;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //숫자 입력
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();

        //연산자 입력
        System.out.print("연산자 입력 : ");
        String op = sc.next();




        // 더하기 일때
        if ( op == "+") {
         System.out.println(sum(num1,num2));}

        //빼기 일때
        else if (op == "-") {
        }
        //나기일때
        else if (op == "/") {

        }
        // 곱하기 일때
        else if (op == "*") {


        }

        else System.out.println("잘못된 연산자입니다");
    }


    }




