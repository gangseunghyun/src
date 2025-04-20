package Day02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 입력준비
        //정수 입력
        System.out.print("숫자 입력 : ");
        int a = sc.nextInt();
        System.out.println("입력하신 값 : "+a);

        //문자열 입력
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        System.out.println("입력한 문자열 : "+str);
        System.out.println(a+str);
        System.out.println(a);
        System.out.println(str);
        // a의 값?
        System.out.println("안녕하세요."+(5+3)); // 안녕하세요.8
        System.out.println("안녕하세요."+5+3); // 안녕하세요.53
    }
}
