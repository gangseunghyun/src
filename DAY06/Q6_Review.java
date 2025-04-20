package DAY06;
/*
좌석은 18자리
9행 2열
행과 열 모두 입력시 프로그램 종료
이미 예약한곳을 또 입력시 비어있는 좌석 출력

1. 숫자 입력받기
2. 모든 위치에 숫자 넣어두기
3. 내가 쓴 수가 또 나오면 중복값으로 인식해서 나머지 남은 좌석을 보여주기

0~8
0~1 이기 때문에 +1
 */

import java.util.Scanner;

public class Q6_Review {
    public static void main(String[] args) {
        int [][] seat = new int[9][2];
        Scanner sc = new Scanner(System.in);
        int count = 18;

        while (count>0){

            System.out.println("예약하실 좌석을 입력해주세요. 총"+count+"석");
            System.out.print("행 : ");
            int h = sc.nextInt()-1;
            System.out.print("열 : ");
            int y = sc.nextInt()-1;
            //올바른 입력
            if (h>=0 && h<9 && y>=0 && y<2){
                if (seat[h][y]==0){
                    System.out.println("예약이 완료 됐습니다.");
                    seat[h][y]=1;
                    count--;
                }
                else {
                    System.out.println("예약이 완료된 자리입니다. 다시 예약해주세요.");
                    System.out.println("비어있는 좌석");
                    for (int i = 0; i < seat.length; i++) {
                        for (int j = 0; j < seat[i].length; j++) {
                            if (seat[i][j] == 0) {
                                System.out.println("행 : " + (i+1) + " 열 : " + (j+1));
                            }
                        }
                    }
                }
            }
            //잘못된 입력
            else System.out.println("잘못된 입력입니다.");
        }
        System.out.println("모든 자리가 예약 됐습니다.");

    }
}
