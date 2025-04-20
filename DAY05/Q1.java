package DAY05;

/*
가위바위보 게임
1. 게임시작 2.종료      :1(엔터)
<첫화면.
1.가위 2.바위 3.보 를 선택해주세요.    : 2 (바위) 엔터
Com이 만약 1(가위)면 User(바위)로 User 승


com이 내는건 랜덤값
내가 내는건 if문
종료 전까지 무한반복 -> While
 */


import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.print("1. 게임시작  2. 종료 ");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("1.가위 2.바위 3.보를 선택해주세요.");
                int num1 = sc.nextInt();

                Random r = new Random();
                int com = r.nextInt(3)+1;
                System.out.println("Com : "+com);


                if (num1 == 1) {
                    if (com == 1){
                        System.out.println();
                        System.out.println("무승부");
                    } else if (com == 2) {
                        System.out.println("Com 승");
                    }
                    else System.out.println("User 승");
                } else if (num1 == 2) {
                    if (com == 1){
                        System.out.println("User 승");
                    } else if (com == 2) {
                        System.out.println("무승부");
                    }
                    else System.out.println("Com 승");

                } else if (num1 == 3) {
                    if (com == 1){
                        System.out.println("Com 승");
                    } else if (com == 2) {
                        System.out.println("User 승");
                    }
                    else System.out.println("무승부");


                } else System.out.println("잘못된 입력입니다.");

            } else if (num == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else System.out.println("잘못된 입력입니다.");

        }
    }
}
