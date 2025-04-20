package DAY03_T;

import java.util.Scanner;

/*
1. 입력 -> 월 온도
2. 출력
   2-1 올바른 입력
   2-2 범위안에 잘못 된 입력
   2-3 잘못된 입력
 */
public class Q1 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in); //입력준비
        System.out.print("월 입력 : "); // 월 입력 출력
        int month = sc.nextInt(); // 정수를 입력 받아 정수 변수 month에 대입
        System.out.print("온도 입력 : "); // 온도 입력 출력
        int temp = sc.nextInt(); // 정수를 입력 받아 정수 변수 month에 대입
        //2. 출력
        //2-3 잘못된 입력
        if(month < 1 || month >12 || temp < -15 || temp >37){
            System.out.println("잘못된 입력 입니다.");
        }
        //2-1, 2-2 올바른 입력 ,올바른 입력이집만 잘못된 입력
        else{
            if(month > 2 && month <6){ //봄
                if(temp >=3 && temp<=15){
                    System.out.println("계절은 봄 입니다. 온도는 "+temp+"도 입니다.");
                }
                else{
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            else if(month > 5 && month <9){//여름
                if(temp >=18 && temp<=37){
                    System.out.println("계절은 여름 입니다. 온도는 "+temp+"도 입니다.");
                }
                else{
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            else if(month > 8 && month <12){ //가을
                if(temp >=3 && temp<=15){
                    System.out.println("계절은 가을 입니다. 온도는 "+temp+"도 입니다.");
                }
                else{
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            else{ // 겨울
                if(temp >=-15 && temp<=2){
                    System.out.println("계절은 겨울 입니다. 온도는 "+temp+"도 입니다.");
                }
                else{
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
        }
    }
}
