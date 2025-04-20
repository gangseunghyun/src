package DAY08;
/*
무한 반복 프로그램
<첫화면>
1. 구구단 출력
2. 별찍기 출력
3. 종료

 */

// 출력

import java.util.Scanner;

public class Q4 {

    //첫화면
    static int first (){
        Scanner sc = new Scanner(System.in);
        System.out.println("<첫화면>\n1. 구구단 출력\n2. 별찍기 출력\n3. 종료");

        return sc.nextInt();
    }


    //1번 입력시
    static int run (int a) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            if (a == 1) {//구구단
                gugu();
            } else if (a == 2) {// 별찍기
                star();
            } else if (a == 3) {
                System.out.println("종료입니다.");
                return 0;
            } else System.out.println(wrong());

            a=first();

        }
    }
        //잘못 입력
        static String wrong (){
            return "잘못된 입력입니다.";
        }

        //구구단
        static void gugu () {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 원하는 구구단 출력\n2. 전체 구구단");
            int user2 = sc.nextInt();
                if (user2==1){
                    System.out.print("원하는 구구단을 입력하세요. ");
                    int gnum = sc.nextInt();
                    if (!(gnum < 2 || gnum > 9)) { //gnum이 2~9일 때 구구단 출력
                        for (int i = 1; i < 10; i++) {
                            System.out.println(gnum + " X " + i + " = " + gnum * i);
                        }

                    } else {
                        System.out.println(wrong());
                    }

                }
                else if(user2==2) {
                    int dan;
                    int times;
                    for (times = 1; times <= 9; times++) {
                        for (dan = 2; dan <= 5; dan++) {
                            System.out.printf("%d X %d = %d\t", dan, times, dan * times);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (times = 1; times <= 9; times++) {
                        for (dan = 6; dan <= 9; dan++) {
                            System.out.printf("%d X %d = %d\t", dan, times, dan * times);
                        }
                        System.out.println();
                    }

                }
                else System.out.println(wrong());

        }

        //별찍기
        static void star () {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 네모");
            int num = 5;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("2. 직삼각형");
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("3. 역직삼각형");
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("4. 피라미드");
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - 1 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i * 2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("5. 다이아몬드");
            for (int i = 0; i < num / 2 + 1; i++) {
                for (int j = 0; j < num / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i * 2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < num / 2; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = num / 2 + (num / 2 - 1); k - (i * 2) > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }



    // 메인문
    public static void main(String[] args) {


        run(first());

    }
}
