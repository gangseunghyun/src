package Day05_T;

import java.util.Random;
import java.util.Scanner;

public class Q5_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ran = new int[3]; // 초기값 0
        while(ran[0] == ran[1] || ran[0] == ran[2] || ran[1] == ran[2]){
            ran[0] = r.nextInt(9)+1;
            ran[1] = r.nextInt(9)+1;
            ran[2] = r.nextInt(9)+1;
        }
        System.out.println(ran[0]+","+ran[1]+","+ran[2]);
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
        int[] user = new int[3];
        while(strike < 3){
            System.out.print("첫째자리 : ");
            user[0] = sc.nextInt();
            System.out.print("둘째자리 : ");
            user[1] = sc.nextInt();
            System.out.print("셋째자리 : ");
            user[2] = sc.nextInt();

            //잘못된 입력
            if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]
                    || user[0] < 1 || user[0] >9 || user[1] <1 || user[1] >9
                    ||user[2] <1 || user[2] > 9){
                System.out.println("잘못된 입력 입니다.");
            }
            //올바른 입력
            else{
                strike = 0;
                ball = 0;
                //strike 계산
                if(user[0] == ran[0]){
                    strike++;
                }
                if(user[1] == ran[1]){
                    strike++;
                }
                if(user[2] == ran[2]){
                    strike++;
                }
                //ball
                if(user[0] == ran[1] || user[0] == ran[2]){
                    ball++;
                }
                if(user[1] == ran[0] || user[1] == ran[2]){
                    ball++;
                }
                if(user[2] == ran[0] || user[2] == ran[1]){
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
