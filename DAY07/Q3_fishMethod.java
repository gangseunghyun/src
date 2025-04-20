package DAY07;

import java.util.Random;
import java.util.Scanner;

public class Q3_fishMethod {
    static int fish = 0;

    //물고기 자리배치
    static int[][] fish(Random r, int[][] lake) {

        // 호수에 물고기 배치

        while (fish < 3) {
            int ran1 = r.nextInt(5);
            int ran2 = r.nextInt(5);

            if (lake[ran1][ran2] == 0) {
                lake[ran1][ran2] = 1;
                fish++;
            }

        }
        return lake;
    }

    //캐스팅 전 자리 배치 확인
    static void seat1(int[][] lake) {
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j] == 0) {
                    System.out.print("○");
                } else System.out.print("●");
            }
            System.out.println();
        }
    }


    //캐스팅
    static int [] cast(Scanner sc, int[][] lake) {
        int [] input = new int[2];
        while (true) {
            System.out.print("캐스팅 시작 \n행 : ");
            input [0] = sc.nextInt() - 1;
            System.out.print("열 : ");
            input [1] = sc.nextInt() - 1;
            //잘못된 캐스팅
            if (input[0] < 0 || input[0] > 4 || input [1] < 0 || input [1] > 4) {
                System.out.println("다시 캐스팅 해주세요.");
            } else break;
        }

        if (lake[input[0]][input [1]] == 1) {
            System.out.println("물고기를 잡았습니다.");
            lake[input [0]][input [1]] = 0;
            fish--;
        }

        return input;
    }

    //캐스팅 후 자리 배치 확인
    static void seat2(int[][] lake,int [] input) {

        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (i == input[0] && j == input[1]) {
                    System.out.print("X");
                } else if (lake[i][j] == 0) {
                    System.out.print("○");
                } else System.out.print("●");
            }
            System.out.println();
        }
    }

    //무빙
    static void move (Scanner sc,int [][] lake,int [] input) {
        while (fish > 0) {

            System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
            int input3 = sc.nextInt();

            if (input3 == 1) {
                input[0]--;
                if (input[0] < 0) {
                    System.out.println("더 이상 위로 움직일 수 없습니다.");
                    input[0]++;
                }
            } else if (input3 == 2) {
                input[0]++;
                if (input[0] > 4) {
                    System.out.println("더 이상 아래로 움직일 수 없습니다.");
                    input[0]--;
                }
            } else if (input3 == 3) {
                input[1]--;
                if (input[1] < 0) {
                    System.out.println("더 이상 왼쪽으로 움직일 수 없습니다.");
                    input[1]++;
                }
            } else if (input3 == 4) {
                input[1]++;
                if (input[1] > 4) {
                    System.out.println("더 이상 오른쪽으로 움직일 수 없습니다.");
                    input[1]--;
                }
            } else System.out.println("잘못된 입력입니다.");

            if (lake[input[0]][input[1]] == 1) {
                System.out.println("물고기를 잡았습니다.");
                lake[input[0]][input[1]] = 0;
                fish--;
            }
            seat2(lake,input);
        }
    }

        public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[][] lake = new int[5][5];


        seat1(fish(r, lake));  //캐스팅 전 물고기 자리 출력
        int [] input = cast(sc,lake);//캐스팅 호출(실행)과 동시에 input에 대입
        seat2(lake,input); //캐스팅 후 자리 출력
        move(sc,lake,input); //무빙
        System.out.println("물고기를 다 잡았다!!");










        }

    }
