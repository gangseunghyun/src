package DAY05;

import java.util.Random;
import java.util.Scanner;

/*
숫자 야구게임
랜덤 변수 3자리 -> 중복되면 안됨 okay
입력 세개okay -> 틀릴때마다 반복 -> while문 안에 넣어야함.
옳은 입력 -> 각각의 수가 같지 않아야하고 1~9 안에 들어가야함
자리와 숫자가 맞으면 strike
숫자만 맞으면 ball

나머지 홈런

 */
public class Q3More_Review {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ran1 = r.nextInt(9) + 1;
        int ran2 = r.nextInt(9) + 1;
        int ran3 = r.nextInt(9) + 1;

        while (ran1 == ran2 || ran1 == ran3 || ran2 == ran3) {
            ran1 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
            ran3 = r.nextInt(9) + 1;
        }
        System.out.println("com : "+ran1+" "+ran2+" "+ran3);
        while (true) {
            //사용자 입력
            System.out.print("숫자 1 : ");
            int user1 = sc.nextInt();
            System.out.print("숫자 2 : ");
            int user2 = sc.nextInt();
            System.out.print("숫자 3 : ");
            int user3 = sc.nextInt();

            int strike = 0;  //다시 돌때마다 초기화 해야하기때문에 처음에 선언과 동시에 초기화.
            int ball = 0;
            //잘못된 입력
            if (user1 == user2 || user1 == user3 || user2 == user3
                    || user1 < 1 || user1 > 9 || user2 < 1 || user2 > 9 || user3 < 1 || user3 > 9) {
                System.out.println("잘못된 입력입니다.");
            } else {
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
                    System.out.println("축하합니다. 홈런입니다.");
                    break;
                } else if (strike == 0 && ball == 0) {
                    System.out.println("아웃입니다.");
                } else System.out.println("strike : " + strike + "개, ball : " + ball + "개");

            }

        }
    }
}
