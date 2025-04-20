package Day04_T;

import java.util.Scanner;

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
public class Q2_1 {
    public static void main(String[] args) {
        //1. 입력 준비
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.원하는 구구단 출력");
            System.out.println("2.전체 구구단 출력");
            System.out.println("3.종료");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("원하는 구구단 : ");
                int dan = sc.nextInt();
                if(dan >=2 && dan <=9){
                    for(int times = 1;times <=9;times++){
                        System.out.println(dan + "X" +times+"="+dan * times);
                    }
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if(num == 2){
                /*
                for(int dan = 2;dan<=9;dan++){
                    System.out.println(dan+"단!!");
                    for(int times = 1;times <=9;times++){
                        System.out.println(dan + "X" +times+"="+dan * times);
                    }
                }

                 */
                int dan;
                int times;
                for(times = 1; times<=9;times++){
                    for(dan = 2; dan<=5;dan++){ //times 1 *  2~5단 개행 하고 다시 times 2 * 2~5단 개행 반복을 times 9까지
                        System.out.printf("%d * %d =%d\t",dan,times,dan*times);
                    }
                    System.out.println();
                }
                System.out.println();
                for(times = 1; times<=9;times++){
                    for(dan = 6; dan<=9;dan++){
                        System.out.printf("%d * %d =%d\t",dan,times,dan*times);
                    }
                    System.out.println();
                }
            }
            else if(num == 3){
                System.out.println("프로그램 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}
