package Day05_T;

import java.util.Random;
import java.util.Scanner;

/*
업다운 게임
1~100까지 난수를 만들고 숫자를 맞출때까지 반복되는 게임
사용자 입력, 난수, 업, 다운 , 정답을알려주는 기능
 */
public class Q3 {
    public static void main(String[] args) {
        //1.입력준비
        Scanner sc = new Scanner(System.in);
        //2.랜덤준비
        Random r = new Random();
        int com = r.nextInt(100)+1;
        System.out.println("Com : "+com);
        while (true){
            System.out.println("숫자 입력 : ");
            int userNum = sc.nextInt();
            //업, 다운, 정답, 잘못된입력
            if(userNum < 1 || userNum >100){
                System.out.println("잘못된 입력입니다.");
            }
            else if(com > userNum){
                System.out.println("업");
            }
            else if(com < userNum){
                System.out.println("다운");
            }
            else{
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
