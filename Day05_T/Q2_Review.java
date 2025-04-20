package Day05_T;

import java.util.Random;
import java.util.Scanner;


/*
가위바위보
"1. 게임시작 2. 종료
1-> 1. 가위 2. 바위 3. 보
종료를 누르지 않는한 첫회면으로 이동
 */


public class Q2_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        while (true) {
            System.out.print("1. 게임 시작  2.종료 ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("1. 가위 2. 바위 3. 보 : ");
                int num2 = sc.nextInt(); //user가 내는 거
                if (num2 < 4 && num2 > 0) { // 정상 범위일때
                    int ran = r.nextInt(3) + 1; // 0 1 2 -> 1 2 3 계속 바뀌어야하기때문에 반복문안에
                    int result = num2 - ran;
                    if (result == -2 || result == 1) {
                        System.out.println("user 승");// 이기는 경우의 수를 result에 대입 1번 가위 -> 3번 보 = -2 / 2번 바위 -> 1번 가위 = 1 / 3번 보 -> 2번 바위 = 1
                    } else if (result == 0) {
                        System.out.println("무승부");
                    } else if (result == -1 || result == 2){
                        System.out.println("com 승"); //1번 가위 -> 2번 바위 = -1 / 2번 바위 -> 3번 보 -1 / 3번 보 -> 1번 가위 2
                        }
                }
                else System.out.println("잘못된 입력입니다.");

            }
            else if (num == 2) {
                System.out.println("프로그램을 종료 합니다");
                break;
            }
            else System.out.println("잘못된 입력입니다.");


        }
    }
}
