package Day05_T;

import java.util.Random;
import java.util.Scanner;

public class Q2_1 {
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
                    // 숫자 입력이 들어온다.
                    // USER 이기는경우 무승부 그 나머지 COM승
                    //U : 1 C : 3 / U : 2 C : 1 / U : 3 C : 2
                    // U - C => -2 , 1 0
                    System.out.println("Com : "+comNum);
                    int result = userNum - comNum;
                    if(result == -2 || result == 1){
                        System.out.println("USER 승");
                    }
                    else if(result == 0){
                        System.out.println("무승부");
                    }
                    else{
                        System.out.println("Com 승");
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
