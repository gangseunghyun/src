package DAY08;

import java.util.Scanner;

public class Q2 {




    /*
첫화면
1.사각형 넓이
2. 삼각형 넓이
3. 종료

1,2번 선택시 1. 가로 :  2. 세로:  후  결과값 출력 예) 사각형 넓이 : 25
후 첫화면으로 이동
(1~3 이외의 값이 들어가면 잘못된 입력입니다. 출력

사각형 넓이 -> 주고받고 -> 자료형 & 매개변수
삼각형 => 안주고 받고 -> void & 매개변수
숫자 입력함수 -> 주고 안받고 -> 자료형 & 매개변수x

메소드 만들고 메인문 안에 조립
or
메인문 구조 짜고

1. 첫화면 띄우고 입력 받고
2. 첫화면의 숫자 선택 조건 확인
2-1. 옳바른 입력 시 그 다음 사각형 넓이 or 삼각형 넓이.
2-2. 잘못된 입력시 "잘못된 입력입니다" 출력
3. 종료시 종료. 이외에는 반복 시키기

 */


    //첫화면 입력  자료형 & 매개변수x
    static int first() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫화면");
        System.out.println("1. 사각형 2. 삼각형 3. 종료");

        return sc.nextInt();

    }
    static int[] input(Scanner sc){
        int [] num = new int[2];
        System.out.print("1. 가로 : ");
        num [0] = sc.nextInt();
        System.out.print("2. 세로 : ");
        num [1] = sc.nextInt();
        return num;
    }

    // 2번째 화면 출력 후 사각형 넓이 구하기 주고 받고
    static int rect(int a,int b){
        return a*b;
    }

    //삼각형 안주고 받고 void & 매개변수
    static void tri (int a, int b) {
        System.out.println("삼각형 넓이 : "+(a*b)/2);

    }


    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);


    while (true){


        int choice = first(); // 이렇게 나오면 first에 있는 코드들이 실행되고 값이 choice에 저장됨.

        if (choice==1) {// 조건 확인  옳바른 입력 1번 선택시
            int [] num  =input(sc);
            System.out.println("사각형 넓이 : "+rect(num[0],num[1]));//사각형 넓이 구하는 메소드

        }
        else if (choice==2) {// 2번선택
            int [] num  =input(sc);
            tri(num[0],num[1]); //삼각형 메소드

        }
        else if (choice==3) {
            System.out.println("종료입니다.");
            break;
        }

        //잘못된 입력
        else System.out.println("잘못된 입력입니다.");


    }







}
}

