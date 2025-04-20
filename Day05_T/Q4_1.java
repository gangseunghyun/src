package Day05_T;

import java.util.Random;
import java.util.Scanner;

public class Q4_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int ran1 = r.nextInt(9)+1;
        int ran2 = r.nextInt(9)+1;
        int ran3 = r.nextInt(9)+1;
        while(ran1 == ran2 || ran1 == ran3 || ran2 == ran3){
            ran1 = r.nextInt(9)+1;
            ran2 = r.nextInt(9)+1;
            ran3 = r.nextInt(9)+1;
        }
        System.out.println(ran1+","+ran2+","+ran3);
        /*
        사용자 숫자를 3개 입력하면 컴퓨터 난수와 비교를 해서
        자릿수랑 숫자가 같으면 strike
        자릿수는 다른데 숫자가 같으면 ball
        같은게 하나도 없으면 out
        모두 같으면 home run -> 프로그램 종료
        1~9입력이 아니면 잘못된 입력
        중복되게 숫자를 입력하면 잘못된 입력
         */
        Scanner sc = new Scanner(System.in);
        int strike = 0;
        int ball = 0;
        while(strike < 3){
            System.out.print("첫째자리 : ");
            int user1 = sc.nextInt();
            System.out.print("둘째자리 : ");
            int user2 = sc.nextInt();
            System.out.print("셋째자리 : ");
            int user3 = sc.nextInt();

            //잘못된 입력
            if(user1 == user2 || user2 == user3 || user1 == user3
                || user1 < 1 || user1 >9 || user2 <1 || user2 >9
                ||user3 <1 || user3 > 9){
                System.out.println("잘못된 입력 입니다.");
            }
            //올바른 입력
            else{
                strike = 0;
                ball = 0;
                //strike 계산
                if(user1 == ran1){
                    strike++;
                }
                if(user2 == ran2){
                    strike++;
                }
                if(user3 == ran3){
                    strike++;
                }
                //ball
                if(user1 == ran2 || user1 == ran3){
                    ball++;
                }
                if(user2 == ran1 || user2 == ran3){
                    ball++;
                }
                if(user3 == ran1 || user3 == ran2){
                    ball++;
                }

                if(strike == 0 && ball == 0){
                    System.out.println("Out입니다.");
                }
                else if(strike == 3){
                    System.out.println("홈런입니다.");
                }
                else{
                    System.out.println("strike : "+strike+", ball : "+ball);
                }
            }
        }
    }
}
