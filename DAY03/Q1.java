package DAY03;

/*
월을 입력, 온도 입력
3~5월 봄 3~15도
6~8월 여름 18~37도
9~11월 가을 3~15도
12~2월 겨울 1~-15도

ex) 월 입력 : 3 (엔터)
온도 입력 : 8(엔터)
계절은 봄입니다. 온도는 8도 입니다(출력)

월 입력 : 3 (엔터)
온도 입력 : -10(엔터)
계절과 온도가 맞지 않습니다 (출력)

1. 스캐너로 입력준비
2. 입력 자리 생성
3. 변수 생성
3-1.올바른 입력
3-2.범위 안에 잘못된 입력
3-3.잘못된 입력

4. 결과값 출력


 */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

       //1. 입력
        Scanner scr = new Scanner(System.in);  //입력준비
        System.out.print("월 입력 : "); //월 입력 출력
        int season = scr.nextInt(); // 정수를 입력 받아 정수 변수인 season에 대입
        System.out.print("온도 입력 : ");//온도 입력 출력
        int tem = scr.nextInt(); //정수를 입력 받아 정수 변수인 tem에 대입

        //2. 출력

        if (season>2 && season<6 && tem>2 && tem<16){
            System.out.println("계절은 봄입니다. 온도는 "+tem+"도 입니다.");
        }
        else if (season>5 && season<9 && tem>17 && tem<38) {
            System.out.println("계절은 여름입니다. 온도는 "+tem+"도 입니다.");
        }
        else if (season>8 && season<12 && tem>2 && tem<16) {
            System.out.println("계절은 가을입니다. 온도는 "+tem+"도 입니다.");
        }
        else if ((season==12 || (season>0 && season<3)) && tem<2 && tem>-16) {
            System.out.println("계절은 겨울입니다. 온도는 "+tem+"도 입니다.");
        }
        else if ((season<1 || season>12) || (tem<-15 || tem>37)) {
            System.out.println("잘못된 입력입니다.");
        }
        else System.out.println("계절과 온도가 맞지 않습니다.");



    }
}
