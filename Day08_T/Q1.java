package Day08_T;

import java.util.Scanner;

/*
1. 세과목 점수 입력 기능 - 주고 안받고(2) - 1
2. 평균 학점 연산 - 주고 받고(1) - 3 - 1 - 1
3. 평균 학점 결과 - 주고 받고 (1)- 3 - 1 - 2
4. 잘못된 입력 값 확인 - 안주고 받고(3) - 2
5. 잘못된 입력 출력 - 안주고 안받고(4) - 3-2
6. 평균 학점 출력 - 안주고 받고(3) - 3- 1- 3
 */
public class Q1 {
    //1. 세과목 점수 입력(2)
    static int[] inputSocre(){
        //입력 준비
        Scanner sc = new Scanner(System.in);
        //세과목 정수 배열
        int[] score = new int[3];
        //과목에 대한 배열
        String[] subject = {"국어","영어","수학"};
        for(int i = 0;i<score.length;i++){
            System.out.print(subject[i] + " : ");
            score[i] = sc.nextInt();
        }
        return score;
    }
    //2. 잘못된 입력이 있는지 확인 (3)
    static void wrongCheck(int[] score){
        boolean check = true;
        for(int i =0;i<score.length;i++){
            if(score[i] < 0 || score[i] > 100){
                check = false;
                break;
            }
        }
        //올바른 입력
        if(check){
            double avg =totalAVG(score);
            String hakjum = avgHakJum(avg);
            avgPrint(avg,hakjum);
        }
        // 잘못된 입력
        else{
            wrongPrint();
        }
    }
    //3-2 잘못된 입력 출력 (4)
    static void wrongPrint(){
        System.out.println("점수가 잘 못 입력 됐습니다.");
    }
    //3-1-1 평균학점 구하기(1)
    static double totalAVG(int[] a){
        int total = 0;
        for(int i = 0;i<a.length;i++){
            total += a[i];
        }
        return total / 3.0;
    }
    //3-1-2 평균학점 결과 얻기 (1)
    static String avgHakJum(double avg){
        String hakjum = "";
        if(avg >= 95){
            hakjum = "A+";
        }
        else if(avg >= 90){
            hakjum = "A";
        }
        else if(avg >= 85){
            hakjum = "B+";
        }
        else if(avg >= 80){
            hakjum = "B";
        }
        else if(avg >= 75){
            hakjum = "C+";
        }
        else if(avg >= 70){
            hakjum = "C";
        }
        else if(avg >= 60){
            hakjum = "D";
        }
        else {
            hakjum = "F";
        }
        return hakjum;
    }
    //3-1-3 평균과 학점 출력(3)
    static void avgPrint(double avg, String hakjum){
        System.out.printf("평균 %.1f이고 학점은 %s 입니다.",avg, hakjum);
    }

    public static void main(String[] args) {
        /*
        int[] score = inputSocre();
        wrongCheck(score);
         */
        wrongCheck(inputSocre());
    }
}
