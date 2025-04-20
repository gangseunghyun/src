package Day08_T;

import java.util.Scanner;

public class Q1_1 {
    //1. 입력
    static void inputScore(int[] score){

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        score[0] = sc.nextInt();
        System.out.print("영어 : ");
        score[1] =sc.nextInt();
        System.out.print("수학 : ");
        score[2] = sc.nextInt();

    }
    static void wrongCheck(int kor, int eng, int math){
        if(kor >= 0 && kor <= 100 && eng >= 0 && eng <=100 && math >= 0 && math <= 100) {
            //올바른 입력
            double avg = avgRun(kor,eng,math);
            String hakjum = hakjumRun(avg);
            avghakjumPrint(avg, hakjum);
        }
        else {
            wrongPrint();
        }
    }
    static void wrongPrint() {
        System.out.print("점수가 잘 못 입력 됐습니다.");
    }
    static double avgRun(int kor, int eng, int math) {
        return (kor + eng + math) / 3.0;
    }
    static String hakjumRun(double avg) {
        String hakjum="";
        if(avg >= 95){
            hakjum = "A+";
        }
        //90이상 A
        else if(avg >= 90){
            hakjum = "A";
        }
        //85이상 B+
        else if(avg >= 85){
            hakjum = "B+";
        }
        //80이상 B
        else if(avg >= 80){
            hakjum = "B";
        }
        //75이상 C+
        else if(avg >= 75){
            hakjum = "C+";
        }
        //70이상 C
        else if(avg >=70){
            hakjum = "C";
        }
        //60이상 D
        else if(avg > 60){
            hakjum = "D";
        }
        //60미만 F
        else{
            hakjum = "F";
        }
        return hakjum;
    }
    static void avghakjumPrint(double avg, String hakjum){
        System.out.printf("평균 %.1f이고 학점은 %s입니다.",avg,hakjum);
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        inputScore(array);
        wrongCheck(array[0],array[1],array[2]);
    }
}
