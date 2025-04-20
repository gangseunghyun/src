package DAY09;

import java.util.Scanner;


public class Q2 {
    static int seatcount = 18;

    static int [] user (Scanner sc) {


        int [] count = new int[2];

        while (true) {
            //예약 입력 받기
            System.out.println("예약하실 좌석을 입력해주세요.(" + seatcount + "석) : ");
            System.out.print("행 : ");
            count[0] = sc.nextInt()-1; // 행
            System.out.print("열 : ");
            count[1] = sc.nextInt()-1; //열

            if(count[0] > 8 || count[0] < 0 || count[1] > 1 || count[1] < 0) {
                System.out.println("잘못된 입력 입니다.");
            }
            else break;
        }return count;
    }

    static void finish (int[][]seat,int a,int b) {

            if(seat[a][b]==0){
                seat[a][b]=1;
                seatcount--;
                System.out.println("예약이 완료됐습니다.");}

            else if (seat[a][b]==1) {
                System.out.println("이미 예약된 좌석입니다.");
                remainseat(seat);

                }
    }

    static void remainseat (int [][] seat){
        System.out.println("비어있는 좌석");
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (seat[i][j] == 0) {
                    System.out.println("행 : " + (i + 1) + "열 : " + (j + 1));
                }
            }
        }
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seat = new int [9][2];
        while (seatcount>0) {
            int[] bookseat = user(sc);  // 처음시작으로 남은 예약자리수를 seat에 넣음과 예약하는 화면불러옴.
            finish (seat,bookseat[0], bookseat[1]);
        }

        System.out.println("모든 자리가 예약 됐습니다.");
    }
}


