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

        int column;
        int row;
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
        while (true) {
            System.out.print("행 : ");
            column = sc.nextInt() - 1;

            System.out.print("열 : ");
            row = sc.nextInt() - 1;
            if (column > 0 && column < 6 && row > 0 && row < 6) {
                break;
            } else System.out.println("잘못된 입력입니다.");
        }


        //올바르게 입력 했을 경우


        //비어있을때
        if (fish[column][row] == 0) {
            fish[column][row] = 2;
        }
        //물고기가 있을때
        if (fish[column][row] == 1) {
            fish[column][row] = 2;
            System.out.println("물고기를 잡았습니다.");
        }

        for (int i = 0; i < fish.length; i++) {
            for (int j = 0; j < fish[i].length; j++) {
                if (fish[i][j] == 1) {
                    System.out.print("●");
                } else if (i == column && j == row) {
                    System.out.print("X");

                } else System.out.print("○");
            }
            System.out.println();
        }


        //위치이동

        while (true) {

            System.out.println("1.위  2.아래  3.왼쪽  4.오른쪽 ");
            int user = sc.nextInt();

            if (user == 1) {
                column--;
                if (column < 0) {
                    System.out.println("범위를 벗어났습니다.");
                    column = 0;
                }
            } else if (user == 2) {
                column++;
                if (column > 4) {
                    System.out.println("범위를 벗어났습니다.");
                    column = 5;
                }
            } else if (user == 3) {
                row--;
                if (row < 0) {
                    System.out.println("범위를 벗어났습니다.");
                    row = 0;
                }

            } else if (user == 4) {
                row++;
                if (row > 4) {
                    System.out.println("범위를 벗어났습니다.");
                    row = 1;
                }
            } else System.out.println("잘못 입력했습니다.");


            //    }System.out.println("물고기를 모두 잡았습니다.");
        }
    }
}


        //













