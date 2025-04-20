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

public class Q1_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        while (true){

            System.out.print("가위바위보 게임\n1.게임시작 2.종료");
            int input1 = sc.nextInt(); // user의 입력
            int com = r.nextInt(3)+1;
            //올바른 입력
            if (input1>0 && input1<3) {
                if (input1 == 1) {
                    System.out.println("<첫화면>\n1.가위 2.바위 3.보");
                    int input2 = sc.nextInt();
                    if (input2 >0 && input2 <4) {
                        System.out.println("COM : "+com+"번");
                        if (input2 == com) {
                            System.out.println("무승부 입니다.");
                        } else if ((input2==1 && com==3) ||(input2==2 && com==1) || (input2==3 && com==2)) {
                            System.out.println("USER 승");
                        } else  System.out.println("COM 승");

                    }else System.out.println("잘못된 입력입니다.");
                }
                else {System.out.println("프로그램을 종료합니다.");
                        break;}
            }
            //잘못된 입력
            else System.out.println("잘못된 입력입니다.");
        }

    }
}
