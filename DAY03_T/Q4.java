package DAY03_T;

/*
1. 입력 -> 국어, 영어, 수학
2. 국어,영어,수학 점수 입력이 올바른지 확인
   2-1 올바르면 평균과 학점 출력
   2-2 올바르지 않으면 -> 과목마다 점수 잘 못 입력 출력
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng =sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();
        //2. 올바른지 확인
        //2-1 올바른 입력
        if(kor >= 0 && kor <= 100 && eng >= 0 && eng <=100 && math >= 0 && math <= 100){
            double avg = (kor + eng + math) / 3.0;
            //95이상 A+
            if(avg >= 95){
                System.out.printf("평균 %.1f이고 학점은 A+입니다.",avg);
            }
            //90이상 A
            else if(avg >= 90){
                System.out.printf("평균 %.1f이고 학점은 A입니다.",avg);
            }
            //85이상 B+
            else if(avg >= 85){
                System.out.printf("평균 %.1f이고 학점은 B+입니다.",avg);
            }
            //80이상 B
            else if(avg >= 80){
                System.out.printf("평균 %.1f이고 학점은 B입니다.",avg);
            }
            //75이상 C+
            else if(avg >= 75){
                System.out.printf("평균 %.1f이고 학점은 C+입니다.",avg);
            }
            //70이상 C
            else if(avg >=70){
                System.out.printf("평균 %.1f이고 학점은 C입니다.",avg);
            }
            //60이상 D
            else if(avg > 60){
                System.out.printf("평균 %.1f이고 학점은 D입니다.",avg);
            }
            //60미만 F
            else{
                System.out.printf("평균 %.1f이고 학점은 F입니다.",avg);
            }
        }
        //2-2 올바르지 않은 입력
        else{
            //국어 /국어 영어/ 국어 수학/ 수학 영어/ 국어 영어 수학/ 수학 / 영어
            /*
            if(kor <0 || kor >100 && eng >= 0 && eng <=100 && math >=0 && math <=100 ){
                System.out.println("국어 점수가 잘 못 입력됐습니다.");
            }
            else if(eng <0 || eng >100 && kor >= 0 && kor <=100 && math >=0 && math <=100 ){
                System.out.println("영어 점수가 잘 못 입력 됐습니다.");
            }
            else if(math <0 || math >100 && kor >= 0 && kor <=100 && eng >=0 && eng <=100 ){
                System.out.println("수학 점수가 잘 못 입력 됐습니다.");
            }
            */
            if(kor<0 || kor >100){
                System.out.print("국어 ");
            }
            if(eng<0 || eng >100){
                System.out.print("영어 ");
            }
            if(math<0 || math>100){
                System.out.print("수학 ");
            }
            System.out.print("점수가 잘 못 입력 됐습니다.");
        }
    }
}
