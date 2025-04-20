package Day02;

/*
String id = "korea"
String passwd = "1234"

id 입력 : xxxx
패스워드 입력 : xxxxx

id패스워드 일치 시 "환영합니다. Korea님"
둘 중 하나라도 불일치시
id 불일치 -> id가 올바르지 않습니다.
PW 불일치 -> 패스워드가 올바르지 않습니다.
모두 불일치 -> id와 패스워드가 올바르지 않습니다.

1. id와 pw 선언
2. id와 패스워드 입력
3. if else else if 사용
4. 결과값 출력
 */


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //1. 변수 선언과 동시에 초기화
        String id = "Korea";
        String passwd = "1234";
        //2. 입력
        Scanner scr = new Scanner(System.in); // test는 그냥 스캐너의 이름임
        System.out.print("ID 입력 : ");
        String testid = scr.next();     //id 입력

        System.out.print("Passwd 입력 : ");
        String testpw = scr.next(); //비번 입력



        if (id.equals(testid) && testpw.equals(passwd)){
            System.out.println("환영합니다. "+id+"님");
        }
        else if (!id.equals(testid) && testpw.equals(passwd)){
            System.out.println("id가 올바르지 않습니다.");
        }
        else if (id.equals(testid) && !testpw.equals(passwd)) {
            System.out.println("패스워드가 올바르지 않습니다.");
        }

        else   System.out.println("id와 패스워드가 올바르지 않습니다.");





        }
}
