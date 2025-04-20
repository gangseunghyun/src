package Day04_T;


/*
1.원하는 구구단
2.전체 구구단
3. 종료

=>
2,3 그 이외 값은 그냥 다시 원하는 구구단, 전체구구단 종료가 출력
1. 원하는 구구단 -> 원하는 구구단 : 5 => 5 X 1 = 5 .... 5 X 9 = 45
2. 전체 구구단 출력
3. 종료
그 이외는 잘못된 입력입니다.
원하는 구구단 경우에도 2~9 사이 입력이 아니면 잘못된 입력 출력

 */

import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        boolean abc  = true;
        while (true) {

            System.out.println("1.원하는 구구단");
            System.out.println("2.전체 구구단");
            System.out.println("3.종료");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("원하는 단 : ");
                int dan = sc.nextInt();
                for (int times = 1; times <= 9; times++) {
                    System.out.printf("%d * %d = %d\n", dan, times, dan * times);
                }
            } else if (num == 4) {
                for (int dan = 2; dan <= 9; dan++) {
                    for (int times = 1; times <= 9; times++) {
                        System.out.printf("%d * %d = %d\n", dan, times, dan * times);
                    }
                    System.out.println(dan + "번째 for문 끝");
                }


            } else if (num == 2) {
                for (int times = 1; times <= 19; times++) {
                    for (int dan = 2; dan <= 5; dan++) {
                        System.out.printf("%d * %d = %d\t", dan, times, dan * times);

                    }
                    System.out.println();
                }

                for (int times = 1; times <= 19; times++) {
                    for (int dan = 6; dan <= 9; dan++) {
                        System.out.printf("%d * %d = %d\t", dan, times, dan * times);
                    }
                    System.out.println();
                }
                for (int times = 1; times <= 19; times++) {
                    for (int dan = 10; dan <=13 ; dan++) {
                        System.out.printf("%d * %d = %d\t", dan, times, dan * times);
                    }
                    System.out.println();
                }
                for (int times = 1; times <= 19; times++) {
                    for (int dan = 14; dan <= 17; dan++) {
                        System.out.printf("%d * %d = %d\t", dan, times, dan * times);
                    }
                    System.out.println();
                }
                for (int times = 1; times <= 19; times++) {
                    for (int dan = 18; dan <= 19; dan++) {
                        System.out.printf("%d * %d = %d\t", dan, times, dan * times);
                    }
                    System.out.println();
                }

            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }


        }

    }
}
