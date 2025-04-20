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

점수마다 100점을 초과하거나 0이하의 점수 입력시 평균 계산하지 않고 잘못 입력된 각각의 과목과
함께 점수를 잘못 입력했습니다.

올바르게 하면 평균 XX점이고 학점은 XX입니다. -> 이렇게 출력하시오

1. 입력준비 -> 국영수 점수 입력
2. 올바른 조건 확인 -> 올바른 조건 입력 -> 평균내고 학점
3. 잘못된 조건 입력

 */


import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();

        System.out.print("영어 : ");
        int eng = sc.nextInt();

        System.out.print("수학 : ");
        int math = sc.nextInt();


            if ((kor + eng + math) / 3 >= 95) {
                double avg = (kor + eng + math) / 3.0;
                System.out.printf("평균 %.1f점이고 학점은 A+입니다.", avg);
            } else if ((kor + eng + math) / 3 >= 90) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 A입니다.", avg);

            } else if ((kor + eng + math) / 3 >= 85) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 B+입니다.", avg);
            } else if ((kor + eng + math) / 3 >= 80) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 B입니다.", avg);
            } else if ((kor + eng + math) / 3 >= 75) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 C+입니다.", avg);
            } else if ((kor + eng + math) / 3 >= 70) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 C입니다.", avg);
            } else if ((kor + eng + math) / 3 >= 60) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 D입니다.", avg);
            } else if ((kor + eng + math) / 3 < 60) {
                double avg = (double) (kor + eng + math) / 3;
                System.out.printf("평균 %.1f점이고 학점은 D입니다.", avg);
            }


        }
    }
