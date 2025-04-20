package DAY07;

/*
5*5 사이즈의 함수
안에 물고기가 3마리 있는데 자리가 중복되면안됨.
랜덤 좌표. int [][] = new int [][] 0~4랜덤

 */

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[][] fish = new int[5][5];


        int count = 3;
        while (count > 0) {


            int ran1 = r.nextInt(5);
            int ran2 = r.nextInt(5);

            if (fish[ran1][ran2] == 0) {
                fish[ran1][ran2] = 1;
                count--;
            }
        }


        for (int i = 0; i < fish.length; i++) {
            for (int j = 0; j < fish[i].length; j++) {
                if (fish[i][j] == 1) {
                    System.out.print("●");
                } else System.out.print("○");
            }
            System.out.println();
        }

        //캐스팅
        System.out.print("행 : ");
        int column = sc.nextInt() - 1;

        System.out.print("열 : ");
        int row = sc.nextInt() - 1;


        //올바르게 입력 했을 경우
        count=3;
        while (count>0) {
            if (column >= 0 && column < 5 && row >= 0 && row < 5) {

                //비어있을때
                if (fish[column][row] == 0) {
                    fish[column][row] = 2;

                }
                //물고기가 있을때
                else {
                    fish[column][row] = 2;

                    System.out.println("물고기를 잡았습니다.");
                }

                for (int i = 0; i < fish.length; i++) {
                    for (int j = 0; j < fish[i].length; j++) {
                        if (fish[i][j] == 1) {
                            System.out.print("●");
                        } else if (fish[i][j] == 2) {
                            System.out.print("X");

                        } else System.out.print("○");
                    }
                    System.out.println();
                }

                //위치이동


                System.out.println("1.위  2.아래  3.왼쪽  4.오른쪽 ");

                int user = sc.nextInt();

                if (user == 1) {
                    fish[column - 1][row] = 2;


                    //잘못 입력한 경우


                    //출력

                } else {
                    System.out.println("잘못 입력했습니다.");
                    System.out.print("행 : ");
                    column = sc.nextInt() - 1;

                    System.out.print("열 : ");
                    row = sc.nextInt() - 1;
                }
            }


        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}












