package DAY04;
/*
1. 원하는 구구단 출력
2. 전체 구구단 출력
3. 종료

<첫화면>
1번 입력시
원하는 구구단 : 5 -> 5단 출력
2번 입력시 -> 전체 구구단 출력
3번 입력시 -> 프로그램 종료

단 1,2번 실행 완료시 첫화면으로 이동
-1 첫화면 1-3 이외 숫자 입력 시  "잘못된 입력입니다."
두번째 화면 2-9 이외 숫자 입력시 "잘못된 입력입니다."
잘못된 입력 발생시 첫화면으로 이동


 */

import java.util.Scanner;

public class Q2_for {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){


            //첫화면
            System.out.println("<첫화면>\n1. 원하는 구구단 출력\n2. 전체 구구단 출력\n3. 종료");
            int input = sc.nextInt();
            int dan;
            int times;

            if (input>0 && input<4){
                if (input == 1){
                    System.out.print("원하는 구구단 : ");
                    dan = sc.nextInt();
                    if (dan>1&&dan<10) {
                        System.out.println(dan+"단");
                        for (times = 1; times < 10; times++) {
                            int output = dan * times;
                            System.out.println(dan + "X" + times + "=" + output);
                        }
                    }
                    else System.out.println("잘못된 입력입니다.");
                }
                else if (input == 2) {
                    for (dan = 2;dan<10;dan++){
                        System.out.println(dan+"단");
                        for (times=1;times<10;times++){
                            int output = dan * times;
                            System.out.println(dan + "X" + times + "=" + output);
                        }
                    }

                }
                else {System.out.println("프로그램을 종료합니다.");
                        break;}


            }
            else System.out.println("잘못된 입력입니다.");
        }

    }
}
