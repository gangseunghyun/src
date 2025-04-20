package Day07_T;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        // 열 5+ --> -1   행 4+
        // 열 4- --> -1   행 3-
        // 열 3+ ---> -1   행 2+
        // 열 2- ---> -1   행 1-
        // 열 1+ 종료

        // 행, 열, 반복, 스위치, 값
        int R = 0; //행
        int C = -1; //열
        int K = num; //반복횟수
        int SW = 1; //스위치
        int N = 1; //값 1~

        while (true){
            //열 5  0 1 2 3 4 5
            for(int i =0;i<K;i++){
                C = C + SW; // -1 + 1 / 0 + 1 / 1 + 1 / 2 + 1 / 3 +1
                arr[R][C] = N++;
            }
            // -1
            K--;
            if(K == 0){
                break;
            }
            //행
            for(int i = 0;i<K;i++){
                R = R + SW;
                arr[R][C] = N++;
            }

            SW *= -1;
        }

    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    }
}
