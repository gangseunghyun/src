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

기존 계절과 온도에 벗어난 입력은 "잘못된 입력입니다"

1. 스캐너로 입력준비
2. 변수입력
3-1.올바른 입력
3-2.범위 안에 잘못된 입력
3-3.잘못된 입력

4. 결과값 출력


 */


import java.util.Scanner;

public class Q1_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt(); //월 입력준비 완료

        System.out.print("온도 입력 : ");
        int temp = sc.nextInt(); // 온도 입력 준비 완료

        if (month>2 && month<6 && temp>2 && temp<16) {//3~5월 봄 3~15도
            System.out.println("계절은 봄입니다. 온도는 " + temp + "도 입니다");
        }
        else if (month>5 && month<9 && temp>17 && temp<38) { //6~8월 여름 18~37도
            System.out.println("계절은 여름입니다. 온도는 " + temp + "도 입니다");
        }

        else if (month>8 && month<12 && temp>2 && temp<16) { //9~11월 가을 3~15도
            System.out.println("계절은 가을입니다. 온도는 " + temp + "도 입니다");
        }

        else if ((month == 12 || month == 1 || month == 2) && temp<2 && temp>-16) { //12~2월 겨울 1~-15도
            System.out.println("계절은 겨울입니다. 온도는 " + temp + "도 입니다");
        }

        else if (month<1 || month>12 || temp<-15 || temp>37){
            System.out.println("잘못된 입력입니다.");
        }

        else System.out.println("계절과 온도가 맞지 않습니다");

    }
}
