package Day06_T;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //1. 입력 객체 생성
        Scanner sc = new Scanner(System.in);
        //2. 비행기 좌석 배열 생성
        boolean[][] seat = new boolean[9][2]; //초기값 false
        //3. 예약 가능한 좌석 변수
        int count = 18;
        //반복 -> 예약이 끝날때까지 count 0 될 때 까지
        while(count > 0){
            //예약 입력 받기
            System.out.println("예약하실 좌석을 입력해주세요.("+count+"석) : ");
            System.out.print("행 : ");
            int h = sc.nextInt();
            System.out.print("열 : ");
            int y = sc.nextInt();
            //잘못된 입력
//            if(h > 9 || h < 1 || y > 2 || y < 1){
//                System.out.println("잘못된 입력 입니다.");
//            }
//            //올바른 입력
//            else{
//                //1. 예약을 할 수 없는 경우
//                if(seat[h-1][y-1]){
//                    System.out.println("비어있는 좌석");
//                    for(int i = 0;i<seat.length;i++){
//                        for(int j = 0;j<seat[i].length;j++){
//                            if(!seat[i][j]){
//                                System.out.println("행 : "+(i+1)+"열 : "+(j+1));
//                            }
//                        }
//                    }
//                }
//                //2. 예약이 되어 있지 않아서 예약을 할 수 있는 경우
//                else{
//                    System.out.println("예약이 완료됐습니다.");
//                    seat[h-1][y-1] = true;
//                    count--;
//                }
//            }
            if(h > 9 || h < 1 || y > 2 || y < 1){
                System.out.println("잘못된 입력 입니다.");
                continue;
            }
            //1. 예약을 할 수 없는 경우
                if(seat[h-1][y-1]){
                    System.out.println("비어있는 좌석");
                    for(int i = 0;i<seat.length;i++){
                        for(int j = 0;j<seat[i].length;j++){
                            if(!seat[i][j]){
                                System.out.println("행 : "+(i+1)+"열 : "+(j+1));
                            }
                        }
                    }
                }
                //2. 예약이 되어 있지 않아서 예약을 할 수 있는 경우
                else{
                    System.out.println("예약이 완료됐습니다.");
                    seat[h-1][y-1] = true;
                    count--;
                }
        }
        System.out.println("모든 자리가 예약 됐습니다."); //@.@
    }
}
