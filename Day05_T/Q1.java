package Day05_T;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        // 종료 입력이 되기 전까지 계속 반복 되어야 하기 때문에 무한루프
        while(true){
            // 출력
            System.out.println("1.직사각형");
            System.out.println("2.정직삼각형");
            System.out.println("3.역직삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            System.out.println("6.종료");
            // 정수를 입력 받아서 정수 변수 num에 대입
            int num = sc.nextInt();
            // 정수 변수 num이 1이면 실행
            if(num == 1){
                //출력
                System.out.print("숫자 입력 : ");
                //정수 입력을 받아서 정수 변수 count에 대입
                int count = sc.nextInt();
                // 이중 for문
                // 1. 0~ count 변수 값 만큼 반복
                // 2. 0~ count 변수 값 만큼 반복
                      //"*"
                //개행 출력
                for(int j = 0;j<count;j++) {
                    for (int i = 0; i < count; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // 정수 변수 num이 2이면 실행
            else if(num == 2){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                // count 값 보다 작으면 반복
                for(int i = 0;i<count;i++){// 행 0 1 2 3 4
                    for(int j = 0;j<=i;j++){ // 정수 변수 i보다 작거나 같으면 반복
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // 정수 변수 num이 3이면 실행
            else if(num == 3){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                // 0~ count 미만 값 만큼 반복
                for(int i = 0;i<count;i++){ // 0 1 2 3 4
                    // count-1 값을 초기화 하고 이 값이 0보다 크거나 같으면 반복
                    for(int j = count-1;j>=0;j--){ // 4 3 2 1 0
                        // 변수 i가 j보다 작으면 실행
                        if(i < j){
                            System.out.print(" ");
                        }
                        // 변수 i가 j보다 크거나 같으면 실행
                        else{
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            // 정수 변수 num이 4이면 실행
            else if(num == 4){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                //0~count 미만 만큼 반복
                for(int i = 0;i<count;i++) { // 0 1 2 3 4
                    //스페이스 반복문
                    //0~ count - 1 - i 값보다 작으면 실행
                    for(int j = 0;j<count-1-i;j++){ // 4 3 2 1
                        System.out.print(" ");
                    }
                    //별반복문
                    // 0~ k가 i *2보다 작거나 같으면 반복
                    for(int k = 0;k<=i*2;k++){ //0 012 01234 0123456 012345678
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // 정수 변수 num이 5이면 실행
            else if(num == 5){
                System.out.print("숫자 입력 : ");
                int count = sc.nextInt();
                // 5/2 = 2.5 2 + 1
                // 5/2 2.5 -> 2 +1
                for(int i = 0;i<count/2+1;i++) { // 0 1 2 3
                    //스페이스 반복문
                    for(int j = 0;j<count/2-i;j++){ // 012 01 0
                        System.out.print(" ");
                    }
                    //별반복문
                    for(int k = 0;k<=i*2;k++){ // 0 012 01234
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //
                for(int i = 0;i<count/2;i++){ // 0 1
                    for(int j = 0;j<=i;j++){ // 0 01
                        System.out.print(" ");
                    }
                    //3 + 0 / 5 + 1 / 7 + 2 / 9 + 3/  11 +4 / 13 + 5
                    // 3                                3 -0
                    for(int k = count/2 + (count/2 - 1);k-(i*2) > 0;k--){ //321 1
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // 정수 변수 num이 6이면 실행
            else if(num == 6){
                // 출력
                System.out.println("프로그램을 종료합니다.");
                // 프로그램 종료
                break;
            }
            // 정수 변수 num이 1~6이 아니면 실행
            else{
                //출력
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
