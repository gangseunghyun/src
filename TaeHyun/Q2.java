package TaeHyun;

/*
나이를 세는 방법은 여러 가지가 있습니다. 그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
연 나이는 태어난 순간 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 각각 나이의 계산법은 다음과 같습니다.

한국식 나이 : 현재 연도 - 출생 연도 + 1
연 나이 : 현재 연도 - 출생 연도

출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열이 주어질 때 2030년에
몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요. 문자열이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.
----------------
입출력 예
입력 #1
생년 : 2000
한국식나이 or 연나이 : Korea

출력 #1
제 나이는 31 입니다.
-------------
입력 #2
생년 : 1999
한국식나이 or 연나이 : Year

출력 #2
제 나이는 31 입니다.

---------------------
입출력 예 설명
입출력 예 #1

2030년에 2000년생의 한국식 나이는 2030 - 2000 + 1 = 31살입니다.
입출력 예 #2

2030년에 1999년생의 연 나이는 2030 - 1999 = 31살입니다.
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("생년 : ");
         int age = sc.nextInt();

        System.out.print("한국식나이 or 연나이 : ");
        String option = sc.next();

        if (option.equals("Korea")){
            System.out.println("제 나이는 "+(2030-age+1)+"입니다.");
        }
        else if (option.equals("Year")){
            System.out.println("제 나이는 "+(2030-age)+"입니다.");
        }
        else System.out.println("잘못 입력하였습니다.");

    }
}
