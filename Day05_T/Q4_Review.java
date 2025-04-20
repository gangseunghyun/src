package Day05_T;

import java.util.Random;
import java.util.Scanner;

/*
       사용자 숫자를 3개 입력하면 컴퓨터 난수와 비교를 해서
       자릿수랑 숫자가 같으면 strike
       자릿수는 다른데 숫자가 같으면 ball
       같은게 하나도 없으면 out
       모두 같으면 home run -> 프로그램 종료
       1~9입력이 아니면 잘못된 입력
       중복되게 숫자를 입력하면 잘못된 입력

       랜덤 숫자 3개->중복 제거

       사용자 숫자 3개 입력->중복x, 잘못된 입력 걸러내기
       strike와  ball 을 나눠서 카운팅
 */

public class Q4_Review {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ran1 = r.nextInt(9) + 1; // 랜덤 숫자 1 -> 랜덤은 0~8이기 때문에 +1로
        int ran2 = r.nextInt(9) + 1;
        int ran3 = r.nextInt(9) + 1;

        //랜덤값 중복제거
        while (ran1 == ran2 || ran1 == ran3 || ran2 == ran3) {
            ran1 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
        }
        System.out.println(ran1 + "," + ran2 + "," + ran3);

        int strike = 0;
        int ball = 0;

        while (strike < 3) {
            System.out.print("숫자 1 : ");
            int user1 = sc.nextInt();

            System.out.print("숫자 2 : ");
            int user2 = sc.nextInt();

            System.out.print("숫자 3 : ");
            int user3 = sc.nextInt();


            //중복값 및 잘못된 입력 잡기
            if (user1 == user2 || user1 == user3 || user2 == user3 ||
                    user1 < 1 || user1 > 9 || user2 < 1 || user2 > 9 || user3 < 1 || user3 > 9) {
                System.out.println("잘못된 입력입니다.");

            }
            //올바른 입력
            else {
                if (user1 == ran1) {
                    strike++;
                }
                if (user2 == ran2) {
                    strike++;
                }
                if (user3 == ran3) {
                    strike++;
                }
                if (user1 == ran2 || user1 == ran3) {
                    ball++;
                }
                if (user2 == ran1 || user2 == ran3) {
                    ball++;
                }
                if (user3 == ran1 || user3 == ran2) {
                    ball++;
                }
                if (strike == 3) {
                    System.out.println("홈런입니다.");
                } else if (strike == 0 && ball == 0) {
                    System.out.println("out 입니다.");
                } else System.out.println("strike : " + strike + " ball : " + ball);

            }
        }

    }
}



