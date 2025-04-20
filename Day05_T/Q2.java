package Day05_T;

import java.util.Random;
import java.util.Scanner;

/*
1.게임시작 2.종료:
1인경우 -> 1.가위 2.바위 3.보 :
-> 1~3까지 입력이 들어오면 Com가 난수를 생성해서 비교해서 결과를 출력
첫화면 1~2 아닌 값을 입력하면 잘못된 입력입니다.
게임 시작경우에는 1~3까지 입력이 아니면 잘못된 입력입니다.
종료가 되기 전까지는 무한 반복
 */
public class Q2 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        //2.난수
        Random r = new Random();
        while (true){
            System.out.print("1.게임시작 2.종료:");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("1.가위 2.바위 3.보 :");
                int userNum = sc.nextInt();
                if(userNum > 0 && userNum < 4){
                    //난수 받고 비교하고 출력하고
                    int comNum = r.nextInt(3)+1;
                    System.out.println("Com : "+comNum);
                    if(userNum == 1){
                        if(comNum == 3){
                            System.out.println("USER 승");
                        }
                        else if(comNum == 2){
                            System.out.println("COM 승");
                        }
                        else{
                            System.out.println("무승부");
                        }
                    }
                    else if(userNum == 2){
                        if(comNum == 3){
                            System.out.println("Com 승");
                        }
                        else if(comNum == 2){
                            System.out.println("무승부");
                        }
                        else{
                            System.out.println("USER 승");
                        }
                    }
                    else{
                        if(comNum == 3){
                            System.out.println("무승부");
                        }
                        else if(comNum == 2){
                            System.out.println("USER 승");
                        }
                        else{
                            System.out.println("COM 승");
                        }
                    }
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if(num == 2){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
