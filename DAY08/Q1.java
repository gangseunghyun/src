package DAY08;

import java.util.Scanner;

public class Q1 {

    /*
    1.세과목 점수 입력(국어, 영어, 수학) 정수로 입력 -> 주고 안받고 2번
    평균 점수 연산 -> 주고 받고 1번

    2. 점수마다 100점 초과시 점수 입력하면 평균 계산 x고 잘못 입력했습니다. 후 프로그램 종료
    위의 잘못된 입력값 확인하는건-> 안주고 받고 3번

    3. 올바른 입력했으면 평균 학점구하기만 -> 주고 받고 1번

    4. 위에 구한 평균 학점 출력 -> 안주고 받고 3번

    1.주고받고
    2.주고 안받고  메인문에서 값 안주고 메소드 안의 리턴값 받기
    3.안주고 받고
    4.안주고 안받고


    필요한 조건들을 메소드로 다 만들어 놓고
    나중에 메인문에서 조립

     */

    // 세과목 점수 입력 받기 주고 받고
    static int[] write(){
        Scanner sc = new Scanner(System.in);
        int [] score = new int[3];
        System.out.print("국어 점수 : ");
        score [0] = sc.nextInt();
        wrongCheck(score);
        System.out.print("영어 점수 : ");
        score [1] = sc.nextInt();
        wrongCheck(score);
        System.out.print("수학 점수 : ");
        score [2] = sc.nextInt();
        wrongCheck(score);

        return score;

    }

    // 잘못된 입력 확인 메인문 안의 값을 받아서 코드만 실행 안주고 받고
    static void wrongCheck (int [] score) {
        //올바른입력
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 100) {
                wrongprint();
            }
        }
    }

    // 잘못된 입력입니다 출력
    static void wrongprint (){
        System.out.println("잘못된 입력입니다.");
    }




    // 메인문에서 값을 주면 메소드 안에 매개 변수가 받아서 나한테 리턴 값을 줌.
    // 평균구하기
    static int avg (int[] score){
        return (score[0]+ score[1]+score[2])/3;
    }









//    메인문 불러오는건 마지막에 조합하면 됨.
    public static void main(String[] args) {


        //점수 입력함 array배열에 각각의 점수가 들어감.
        int[] array =write();

        //잘못 된 입력


        //올바른 입력
        //평균 내기 array에 들어가 있는 점수들을 avg메소드에 넣어주기
        System.out.println("평균값 : "+avg(array));



    }
}
