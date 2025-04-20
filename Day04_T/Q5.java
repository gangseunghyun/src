package Day04_T;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.직사각형");
            System.out.println("2.정직삼각형");
            System.out.println("3.역직삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            System.out.println("6.종료");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();

                for(int j = 0;j<count;j++) {
                    for (int i = 0; i < count; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if(num == 2){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();

                for(int i = 0;i<count;i++){// 행 0 1 2 3 4
                    for(int j = 0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if(num == 3){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                for(int i = 0;i<count;i++){ // 0 1 2 3 4
                    for(int j =count;j>0;j--){ // 4 3 2 1 0
                        if(i < j-1){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            else if(num == 4){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                for(int i = 0;i<count;i++) { //  줄 고정


                    for(int j = count-1; j>0+i ;j--){
                        System.out.print(" ");
                    }
                    for(int j = 0 ; j<1+i*2 ;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if(num == 5){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                // 5/2 = 2.5 2 + 1
                for(int i = 0;i<count/2+1;i++) { // 0 1 2 3 4
                    //스페이스 반복문
                    for(int j = 0;j<count/2-i;j++){
                        System.out.print(" ");
                    }
                    //별반복문
                    for(int k = 0;k<=i*2;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = 0;i<count/2;i++){
                    for(int j = 0;j<=i;j++){
                        System.out.print(" ");
                    }
                    //3 + 0 / 5 + 1 / 7 + 2 / 9 + 3/  11 +4 / 13 + 5
                    for(int k = count/2 + (count/2 - 1);k-(i*2) > 0;k--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if(num == 6){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

}

