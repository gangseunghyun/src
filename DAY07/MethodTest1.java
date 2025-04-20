package DAY07;
//public ->접근 제한자

import java.util.Random;
import java.util.Scanner;

public class MethodTest1 {
    //static -> 바로 사용가능하게 메모리에 업뎃
    //main은 스페셜 -> 프로그램이 실행되면 무조건 main부터 실행. 그래서 메소드 이름을 main으로 지으면 x
    public static void main(String[] args) {
    //void -< 자료 안주고 메소드 이름은 main이고 매개변수가 있으니 받음 -> 안주고 받고
    //매개변수는 String[] 문자열 배열

        System.out.println("헬로우"); //여기서 메소드는 println("헬로우"); -> 안주고 받고

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 매개변수가 없기때문에 -> 주고 안받고

        Random r = new Random();

        int ran = r.nextInt(10); // 주고 받고
    }
}
