package DAY07;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new  int[num][num];
        //열 5+  --> -1 행 4+
        //열 4-  --> -1 행 3-
        //열 3+  --> -1 행 2+
        //열 2-  --> -1 행 1-
        //열 1+ 종료

        //행,열,반복,스위치,값
        int R = 0; //행
        int C = 1; // 열
        int K = num; // 반복횟수
        int SW = -1;
        int N = 1; // 값 1~

        while (true){
            //열
            for (int i = 0; i<K;i++){
                C = C + SW;
                arr[R][C] = N++;
            }

        }
    }
}
