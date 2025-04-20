package DAY03;

/* 세과목 점수 국영수 정수로 입력
평균을 소숫점 첫째짜리까지 계산
그 후 평균 학점 출력
95점 이상 A+
90점 이상 A
85점 이상 B+
80점 이상 B
75점 이상 C+
70점 이상 C
60점 이상 D
60점 미만 F

점수마다 100점을 초과하는 점수 입력시 평균 계산하지 않고 입력된 과목과
함께 점수를 잘못 입력했습니다.

올바르게 하면 평균 XX점이고 학점은 XX입니다.

1. 입력준비 -> 국영수 점수 입력
2. 올바른 조건 확인 -> 올바른 조건 입력 -> 평균내고 학점
3. 잘못된 조건 입력

크게 따지면 올바른 입력 or 잘못된 입력 -> if else
올바른 입력 중에서 점수에 따른 학점 -> else if
잘못된 입력은 단일 검사 -> if 단일문

 */


import java.util.Scanner;

public class Q4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();

        System.out.print("영어 : ");
        int eng = sc.nextInt();

        System.out.print("수학 : ");
        int math = sc.nextInt();


        if (kor<=100 && kor>=1 && eng<=100 && eng>=1 && math<=100 && math>=1){  //올바른 조건
           double avg = kor+eng+math/3.0;
        }

      //  else () // 올바르지 않은 조건
    }

}