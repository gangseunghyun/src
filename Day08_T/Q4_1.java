package Day08_T;

import java.util.Scanner;

/*
 1. 입력
 2. 1~3까지 입력 -> 1. 구구단 2.별찍기 3.종료
 3. 1인경우 1.원하는 구구단 2.전체 구구단
 4. 2인경우 1.네모 2.직삼각형 3.역직삼각형 4. 피라미드 5.다이아몬드
 5. 3입력 종료
 6. 위에 값 입력 X 잘못된 입력입니다. 출력
 */
public class Q4_1 {

    static int mainInput(Scanner sc){
        System.out.println("1.구구단 출력");
        System.out.println("2.별찍기 출력");
        System.out.println("3.종료");
        int num = sc.nextInt();
        return num;
    }

    static void mainStart(Scanner sc){
        while(true){
            int num = mainInput(sc);

            if(num == 1){
                int gugunum = guguInput(sc);
                guguMain(sc,gugunum);
                //guguMain(sc,guguInput(sc));

            }
            else if(num == 2){
                int starNum = starInput(sc);
                starMain(starNum);
                //starMain(starInput(sc));
            }
            else if(num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    static int guguInput(Scanner sc){
        System.out.println("1.원하는 구구단 출력");
        System.out.println("2.전체 구구단 출력");
        int gunum = sc.nextInt();
        return gunum;
    }
    static void guguMain(Scanner sc, int gunum){
        if(gunum == 1){
            System.out.print("원하는 구구단 : ");
            int wDan = sc.nextInt();
            if(wDan >= 2 && wDan <=9){
                for(int times = 1; times<= 9;times++){
                    System.out.println(wDan + "X" + times + "=" + wDan * times);
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        else if(gunum == 2){
            int dan;
            int times;
            for(times = 1 ; times<= 9;times++){
                for(dan = 2;dan<=5;dan++){
                    System.out.printf("%d * %d = %d\t",dan,times,dan*times);
                }
                System.out.println();
            }
            System.out.println();
            for(times = 1 ; times<= 9;times++){
                for(dan = 6;dan<=9;dan++){
                    System.out.printf("%d * %d = %d\t",dan,times,dan*times);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static int starInput(Scanner sc){
        System.out.println("1.직사각형");
        System.out.println("2.정직삼각형");
        System.out.println("3.역직삼각형");
        System.out.println("4.피라미드");
        System.out.println("5.다이아몬드");
        int starnum = sc.nextInt();
        return starnum;
    }

    static void starMain(int starnum){
        if(starnum == 1){
            for(int j = 0;j<5;j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(starnum == 2){
            for(int i = 0;i<5;i++){// 행 0 1 2 3 4
                for(int j = 0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(starnum == 3){
            for(int i = 0;i<5;i++){ // 0 1 2 3 4
                for(int j = 5-1;j>=0;j--){ // 4 3 2 1 0
                    if(i < j){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else if(starnum == 4){
            for(int i = 0;i<5;i++) { // 0 1 2 3 4
                //스페이스 반복문
                for(int j = 0;j<5-1-i;j++){
                    System.out.print(" ");
                }
                //별반복문
                for(int k = 0;k<=i*2;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(starnum == 5){
            // 5/2 = 2.5 2 + 1
            for(int i = 0;i<5/2+1;i++) { // 0 1 2 3 4
                //스페이스 반복문
                for(int j = 0;j<5/2-i;j++){
                    System.out.print(" ");
                }
                //별반복문
                for(int k = 0;k<=i*2;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 0;i<5/2;i++){
                for(int j = 0;j<=i;j++){
                    System.out.print(" ");
                }
                //3 + 0  5 + 1 7 + 2 9 + 3 11 +4 13 + 5
                for(int k = 5/2 + (5/2 - 1);k-(i*2) > 0;k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        mainStart(sc);
    }
}

