package DAY03_T;

import java.util.Scanner;

public class xo {
    public static void main(String[] args) {
        int curryear = 2025;
        Scanner sc = new Scanner(System.in);
        System.out.print("생년 : ");
        int year = sc.nextInt();
        System.out.print("만나이 OR 연나이");
        String age = sc.next();

        if(age.equals("Year")){
            System.out.printf("제 나이는 %d 입니다.",curryear - year);
        }else if(age.equals("Korea")){
            System.out.printf("제 나이는 %d 입니다.",curryear - year+1);
        }else{
            System.out.printf("잘못입력하였습니다.");
        }
    }
}
