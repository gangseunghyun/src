package Day07_T;

import java.util.Random;
import java.util.Scanner;

//public 추후 접근 제한자
//class 추후 class
public class MethodTest1 {
    //static -> 바로 사용 가능
    //main은 스페셜 -> 프로그램이 실행하면 무조건 main부터 실행 합니다.
    //메소드 이름을 main으로 지으시면 안됩니다.
    public static void main(String[] args) {
        // void <- 안주고 메소드 이름 main 매개변수가 있으니까 받고
        // 안주고 받고 -> 매개변수 String[] 문자배열을 받습니다.

         System.out.println("헬로우"); // 안주고 받고 3번

        Scanner sc = new Scanner(System.in); // 객체생성 -> class

        int num = sc.nextInt();// 주고 안받고 2번

        Random r = new Random();

        int ran = r.nextInt(10); // 주고 받고 1번
    }
}
