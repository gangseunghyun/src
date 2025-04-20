package DAY04;

/* 별찍기
1번은 별 6개 5줄
2번은 별 한개에서 오른쪽에서 점점 증가
3번은 별 한개에서 왼쪽에서 점점 증가
 */


import java.util.Scanner;

public class Q3_ForStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1번 for로 *이 여섯개 되면 개행 / 반복문은 for는 횟수를 지정  while true인 동안 반복

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("-------------");
        // 한개찍고 개행 되는 조건


        for (int i = 1; i <=5 ; i++){
            for (int j= 1;j<=i ;j++){
                System.out.print("*");

            }
            System.out.println();
        }


        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {System.out.print("*");}
            }
            System.out.println();
        }

    }
}




