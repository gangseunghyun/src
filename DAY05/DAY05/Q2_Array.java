package DAY05.DAY05;

import java.util.Random;
import java.util.Scanner;

/*
랜덤숫자 1~100
숫자 입력 1~100

ex
com : 25
내가 숫자 입려 : 25
맞췄습니다. 축하합니다.

숫자 입력 : 50
다운
숫자 입력 :10
업

맞출때까지 반복 while
랜덤숫자
 */
public class Q2_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        Random r = new Random();
        int com = r.nextInt(100)+1;

        while (true){
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num <= 100 && num >0){
                if (num == com){
                    System.out.println("맞췄습니다. 축하합니다.");
                    break;
                } else if (num>com) {
                    System.out.println("다운");

                } else System.out.println("업");

            }
            else System.out.println("잘못된 입력입니다.");
        }

    }
}
