package Day02;


import java.util.Scanner;

/*
String id = “korea”
String passwd = “1234”


Id 입력 : XXXX
패스워드 입력 : XXXXX

Id와 패스워드가 맞으면  -> “환영합니다. Korea님”

Id와 또는 패스워드가 틀리면
  id가 틀린경우 패스워드 맞고 -> id가 올바르지 않습니다.
  id가 맞고 패스워드가 틀린경우 -> 패스워드가 올바르지 않습니다.
  id 패스워드 모두 틀린경우 -> id와 패스워드가 올바르지 않습니다.


 */
public class Q3 {
    public static void main(String[] args) {
        //1. 변수 선언과 동시에 초기화
        String id = "korea";
        String passwd = "1234";
        //2.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력 : ");
        String inputId = sc.next();
        System.out.print("패스워드 입력 : ");
        String inputPW = sc.next();
        //3.입력과 변수를 가지고 비교
        //3-1 모두 맞은경우
        if(id.equals(inputId) && passwd.equals(inputPW)){
            System.out.println("환영합니다. "+id+"님");
        }
        //3-2 id X 패스워드가 맞은경우
        else if(!id.equals(inputId) && passwd.equals(inputPW)){
            System.out.println("id가 올바르지 않습니다.");

        }
        //3-3 id O 패스워드가 틀린경우
        else if(id.equals(inputId) && !passwd.equals(inputPW)){
            System.out.println("패스워드가 올바르지 않습니다.");
        }
        //3-4 둘다 틀린경우
        else{
            System.out.println("id와 패스워드가 올바르지 않습니다.");
        }

    }
}
