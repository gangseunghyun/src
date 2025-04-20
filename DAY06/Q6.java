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

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] seat = new int[5][5];  // 2중배열 준비


        int garo = seat.length;
        int sero = seat[0].length;
        int count = garo*sero;

        while (count>0) {

/*
            int count = 0;

            for (int i = 0; i < seat.length; i++) {
                for (int j = 0; j < seat[i].length; j++) {
                    if (seat[i][j] == 0) {
                        count++;
                    }
                }
            }

 */
            System.out.println("예약하실 좌석을 입력해주세요. 남은 좌석 : " + count + "석");
            System.out.print("행 : ");
            int line = sc.nextInt();
            System.out.print("열 : ");
            int row = sc.nextInt();

            int a = line - 1;
            int b = row - 1;


            //올바른 입력

            if (a >= 0 && a < garo && b >= 0 && b < sero) {
                //좌석이 비어있을때 값 말고 자리랑 비교

                if (seat[a][b] == 0) {
                    seat[a][b] = 1;
                    System.out.println("예약이 완료 됐습니다.");
                    count--;

                } else {
                    System.out.println("예약이 완료된 자리입니다. 다시 예약해주세요.");
                    System.out.println("남은 좌석");
                    for (int j = 0; j < seat[0].length;j++){
                        for (int i = 0; i<garo;i++){

                            if (seat[i][j] == 0){

                                System.out.print("행 : "+(i+1)+" 열 : "+(j+1)+"\t");

                            }
                            else System.out.print("\t\t\t\t");
                        }System.out.println();
                    }
                }
            }


            else System.out.println("잘못된 입력입니다.");


        }
        System.out.println("예약이 끝났습니다.");
    }
}









