package Day02;


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


import java.util.Scanner;

public class Q3_Review {
    public static void main(String[] args) {

        String id = "Korea";
        String passwd = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Id 입력 : ");
        String tid = sc.next();

        System.out.print("패스워드 입력 : ");
        String tpw = sc.next();

        if (tid.equals(id) && tpw.equals(passwd)) {
            System.out.println("환영합니다. " + id+"님");
        } else if (!tid.equals(id) && tpw.equals(passwd)) {
            System.out.println("id가 올바르지 않습니다.");
        } else if (tid.equals(id) && !tpw.equals(passwd)) {
            System.out.println("패스워드가 올바르지 않습니다.");
        } else System.out.println("id와 패스워드가 올바르지 않습니다.");
    }
}
