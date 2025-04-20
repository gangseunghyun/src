package Day08_T;

import java.util.Scanner;

/*
1.입력
2. 1~3까지 입력 -> 1.구구단 2.별찍기 3.종료
3. 1인경우 -> 1.원하는 구구단 2. 전체 구구단
4. 2인경우 -> 1. 네모 2. 직삼각형 3. 역직삼각형 4. 피라미드 5. 다이아몬드
5. 3인경우 -> 종료
6. 위에 값 입력 X 잘못된 입력입니다. 출력
 */
public class Q4 {

    static int inputAll(Scanner sc, int num){
        int select;
        if(num == 1){
            System.out.println("1.구구단 출력");
            System.out.println("2.별찍기 출력");
            System.out.println("3.종료");
            select = sc.nextInt();
        }
        else if(num == 2){
            System.out.println("1. 원하는 구구단 출력");
            System.out.println("2. 전체 구구단 출력");
            select = sc.nextInt();
        }
        else if(num == 3){
            System.out.print("원하는 구구단 : ");
            select = sc.nextInt();
        }
        else if(num == 4){
            System.out.println("1.직사각형");
            System.out.println("2.정직삼각형");
            System.out.println("3.역직삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            select = sc.nextInt();
        }
        else{
            System.out.print("숫자 입력 : ");
            //정수 입력을 받아서 정수 변수 count에 대입
            select = sc.nextInt();
        }

        return select;
    }

    static void guguMain(Scanner sc){
        int num2 = inputAll(sc, 2);
        if(num2 == 1){
            int dan = inputAll(sc,3);
            for(int i  = 1;i<=9;i++){
                System.out.printf("%d * %d = %d\n",dan,i,dan*i);
            }
        }
        else if(num2 == 2){
            int[] a = new int[2];
            allGugu(a);
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static void allGugu(int[] a){
        for(a[1] = 1 ; a[1]<= 9;a[1]++){
            for(a[0] = 2;a[0]<=5;a[0]++){
                System.out.printf("%d * %d = %d\t",a[0],a[1],a[0]*a[1]);
            }
            System.out.println();
        }
        System.out.println();
        for(a[1] = 1 ; a[1]<= 9;a[1]++){
            for(a[0] = 6;a[0]<=9;a[0]++){
                System.out.printf("%d * %d = %d\t",a[0],a[1],a[0]*a[1]);
            }
            System.out.println();
        }
    }

    static void starMain(Scanner sc){
        int[] array = new int[2];
        array[0]=inputAll(sc,4);
        if(array[0] > 0 && array[0] <6){
            array[1] = inputAll(sc,5);
            printStar(array);
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static void printStar(int[] array){
        if(array[0] == 1){
            for(int j = 0;j<array[1];j++) {
                for (int i = 0; i < array[1]; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(array[0] == 2){
            // count 값 보다 작으면 반복
            for(int i = 0;i<array[1];i++){// 행 0 1 2 3 4
                for(int j = 0;j<=i;j++){ // 정수 변수 i보다 작거나 같으면 반복
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // 정수 변수 num이 3이면 실행
        else if(array[0] == 3){
            // 0~ count 미만 값 만큼 반복
            for(int i = 0;i<array[1];i++){ // 0 1 2 3 4
                // count-1 값을 초기화 하고 이 값이 0보다 크거나 같으면 반복
                for(int j = array[1]-1;j>=0;j--){ // 4 3 2 1 0
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
        else if(array[0] == 4){
            for(int i = 0;i<array[1];i++) { // 0 1 2 3 4
                //스페이스 반복문
                //0~ count - 1 - i 값보다 작으면 실행
                for(int j = 0;j<array[1]-1-i;j++){ // 4 3 2 1
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
        else{
            // 5/2 = 2.5 2 + 1
            // 5/2 2.5 -> 2 +1
            for(int i = 0;i<array[1]/2+1;i++) { // 0 1 2 3
                //스페이스 반복문
                for(int j = 0;j<array[1]/2-i;j++){ // 012 01 0
                    System.out.print(" ");
                }
                //별반복문
                for(int k = 0;k<=i*2;k++){ // 0 012 01234
                    System.out.print("*");
                }
                System.out.println();
            }
            //
            for(int i = 0;i<array[1]/2;i++){ // 0 1
                for(int j = 0;j<=i;j++){ // 0 01
                    System.out.print(" ");
                }
                //3 + 0 / 5 + 1 / 7 + 2 / 9 + 3/  11 +4 / 13 + 5
                // 3                                3 -0
                for(int k = array[1]/2 + (array[1]/2 - 1);k-(i*2) > 0;k--){ //321 1
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void Mainrun(Scanner sc){
        while (true){
            int num1 =inputAll(sc, 1);
            if(num1 == 1){
                guguMain(sc);
            }
            else if(num1 == 2){
                starMain(sc);
            }
            else if(num1 == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mainrun(sc);
    }
}
