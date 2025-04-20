package DAY04;

/*
1. 직사각형 -> 1번 선택 후 숫자 입력 후 직사각형
2. 정직삼각형 ->
3. 역직삼각형
4. 피라미드
5. 다이아몬드
6. 종료


 */

import java.util.Scanner;

public class Q6_ForStar2 {
    public static void main(String[] args) {


        boolean out = true;
        while (out) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1.직사각형");
            System.out.println("2.정직삼각형");
            System.out.println("3.역직삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            System.out.println("6.종료");
            int num = sc.nextInt();
            int num1;
            switch (num) {
                //내가 입력한 숫자

                case 1: // 직사각형
                    System.out.print("숫자를 입력하세요 : ");
                    num1 = sc.nextInt();
                    for (int i = 1; i <= num1; i++) {
                        for (int j = 1; j <= num1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2: //정직삼각형
                    System.out.print("숫자를 입력하세요 : ");
                    num1 = sc.nextInt();
                    for (int i = 1; i <= num1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // 역직삼각형
                    System.out.print("숫자를 입력하세요 : ");
                    num1 = sc.nextInt();
                    for (int i = 0; i < num1; i++) {
                        for (int j = num1 - 1; j >= 0; j--) {
                            if (i < j) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");

                            }
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.print("숫자를 입력하세요 : "); // 피라미드
                    num1 = sc.nextInt();
                    for (int i = 0; i < num1; i++) {
                        for (int j = 0; j < (num1 - 1) - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("숫자를 입력하세요 : "); // 다이아
                    num1 = sc.nextInt();
                    for (int i = 0; i < num1 / 2 + 1; i++) {   // 5를 넣으면 5/2->2.5(int기때문에 0.5 버림) -> 2+1 0부터 시작이니까 0 1 2  /i=0 ++
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
                      //  f




/*
                case 6:
                    System.out.println("프로그램이 종료됩니다.");
                    out = false;
                    break;

           //     case 7:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }

    }
}

*/