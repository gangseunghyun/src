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

올바르게 하면 "평균 XX점이고 학점은 XX입니다."

점수마다 100점을 초과하는 점수 입력시 평균 계산하지 않고 입력된 과목과
함께 "점수를 잘못 입력했습니다." 라고 출력



1. 입력준비 -> 국영수 점수 입력
2. 올바른 조건 확인 -> 올바른 조건 입력 -> 평균내고 학점
3. 잘못된 조건 입력

*/


import java.util.Scanner;

public class Q4_Review {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int korea = sc.nextInt();

        System.out.print("영어 점수 : ");
        int eng = sc.nextInt();

        System.out.print("수학 점수 : ");
        int math = sc.nextInt();

        if (korea<=100 && korea >= 0 && eng<=100 && eng>=0 && math<=100 && math>=0) {
            double avg = (korea + math + eng) / 3.0;
            if (avg >= 95) {
                System.out.printf("평균 %.1f점이고 학점은 A+입니다",avg);
            }
            else if (avg >= 90) {
                System.out.printf("평균 %.1f점이고 학점은 A입니다",avg);
            }
            else if (avg >= 85) {
                System.out.printf("평균 %.1f점이고 학점은 B+입니다",avg);
            }
            else if (avg >= 80) {
                System.out.printf("평균 %.1f점이고 학점은 B입니다",avg);
            }
            else if (avg >= 75) {
                System.out.printf("평균 %.1f점이고 학점은 C+입니다",avg);
            }
            else if (avg >= 70) {
                System.out.printf("평균 %.1f점이고 학점은 C입니다",avg);
            }
            else if (avg >= 60) {
                System.out.printf("평균 %.1f점이고 학점은 D입니다",avg);
            }
            else System.out.printf("평균 %.1f점이고 학점은 F입니다",avg);

        }
            else {
            if (korea > 100 || korea < 0) {
                System.out.print("국어 ");
            }
            if (eng > 100 || eng < 0) {
                System.out.print("영어 ");
            }
            if (math > 100 || math < 0) {
                System.out.print("수학 ");
            }
                System.out.println("점수를 잘못 입력하였습니다.");
            }
        }










    }

