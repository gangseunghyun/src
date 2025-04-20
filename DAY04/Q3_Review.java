package DAY04;

import java.util.Scanner;

public class Q3_Review {
    /* 별찍기
    1번은 별 5개 5줄
    2번은 별 한개에서 오른쪽에서 점점 증가
    3번은 별 한개에서 왼쪽에서 점점 증가
     */
    public static void main(String[] args) {

        int[][] star = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int user = sc.nextInt();

        for (int i = 0; i < user; i++) {
            for (int j = 0; j < user; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("==============");

        for (int i = 0; i < user; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        for (int i = 0; i < user; i++) {
            for (int j = i; j < user - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("==============");

        for (int i = 0; i < user; i++) {
            for (int j = i; j < user - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

        System.out.println("==============");

        for (int i = 0; i < user / 2; i++) {//위에삼각형 줄

            for (int j = 0; j < user/2-i; j++) {//위에 삼각형 " "
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < user/2-1; i++) {
            for (int j = 0; j <= i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j<(2*(user/2-1-i)-1);j++){
                System.out.print("*");      //안 포기! 배추포기
            }
            System.out.println();

        }
    }
}