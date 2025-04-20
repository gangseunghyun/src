package DAY07;
/*
5*5 사이즈의 호수
안에 물고기가 3마리 있는데 자리가 중복되면안됨. 자리는 랜덤
 int [][] = new int [][] 0~4랜덤
자리 배정되면 캐스팅 시작
 ( 좌표 범위 넘어가면 다시 캐스팅)
그 다음 1.위 2.아래 3.왼쪽 4.오른쪽 명령받아 위치 변경
위로 이동시 좌표가 0보다 작아지면 이동x 아래
물고기가 있는 좌표로 같아지면 물고기 잡게됨
3마리 모두 잡을 때까지 진행

 */

import java.util.Random;
import java.util.Scanner;

public class Q3_Review {
    public static void main(String[] args) {
        int[][] lake = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int fish = 3; // 호수에 물고기 배치
        while (fish > 0) {
            int ran1 = r.nextInt(5);
            int ran2 = r.nextInt(5);

            if (lake[ran1][ran2] == 0) {
                lake[ran1][ran2] = 1;
                fish--;
            }
        }

        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j] == 0) {
                    System.out.print("○");
                } else System.out.print("●");
            }
            System.out.println();
        }

        //캐스팅
        int input1;
        int input2;

        while (true) {
            System.out.print("캐스팅 시작 \n행 : ");
            input1 = sc.nextInt() - 1;
            System.out.print("열 : ");
            input2 = sc.nextInt() - 1;
            //잘못된 캐스팅
            if (input1 < 0 || input1 > 4 || input2 < 0 || input2 > 4) {
                System.out.println("다시 캐스팅 해주세요.");
            } else break;
        }

        if (lake[input1][input2] == 0) {
            lake[input1][input2] = 2;  // 2는 캐스팅 자리
        } else {
            System.out.println("물고기를 잡았습니다.");
            lake[input1][input2] = 2;
        }

        while (true) {

            for (int i = 0; i < lake.length; i++) {
                for (int j = 0; j < lake[i].length; j++) {
                    if (lake[i][j] == 0) {
                        System.out.print("○"); //0은 빈자리
                    } else if (lake[i][j] == 2) {
                        System.out.print("X");

                    } else System.out.print("●");  // 1은 물고기자리
                }
                System.out.println();
            }

            System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
            int input3 = sc.nextInt();
            //위로

            //for문으로 sw를 만들어서 1,-1으로 해보쟈 input을 바깥 for문으로
            if (input3 == 1) {
                if (lake[input1 - 1][input2] == 0) { // 비어있을때
                    lake[input1][input2] = 0;
                    lake[input1 - 1][input2] = 2;
                } else {
                    lake[input1 - 1][input2] = 2; //물고기가 있을때
                    lake[input1][input2] = 0;
                    System.out.println("물고기를 잡았습니다.");//막히는 경우도 써야함
                }
            }
            else if (input3 == 2) {
                if (lake[input1+1][input2] == 0){
                    lake[input1][input2] = 0;
                    lake[input1+1][input2] = 2;
                }
                else {
                    lake[input1+1][input2] = 2;
                    lake[input1][input2] = 0;
                    System.out.println("물고기를 잡았습니다.");
                }


                }
            }
        }
    }

