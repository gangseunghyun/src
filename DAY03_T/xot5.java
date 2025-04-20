package DAY03_T;

import java.util.Random;
import java.util.Scanner;

public class xot5 {
    public static void main(String[] args) {

        //1. 호수크기 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("호수 크기를 입력해주세요");
        System.out.print("가로 : ");
        int xd [] = {0,0,-1,1};
        int yd [] = {-1,1,0,0};
        int xsize = sc.nextInt();
        System.out.print("세로 : ");
        int ysize = sc.nextInt();
        int pool [][] =new int[ysize][xsize];
        int fishcount = 3;

        //2. 물고기 세팅
        Random random = new Random();
        for(int i=0; i<fishcount; i++){
            int xtemp = random.nextInt(xsize);
            int ytemp = random.nextInt(ysize);
            if(pool[ytemp][xtemp]==0){
                pool[ytemp][xtemp] = 1;
            }else {
                i --;
            }
        }
        //3. 캐스팅
        System.out.println("캐스팅 할 위치를 지정 해 주세요");
        System.out.print("호수 크기 - ");
        System.out.println("가로 : "+xsize+", 세로 : "+ysize);
        System.out.print("가로입력 : ");
        int x = sc.nextInt();
        System.out.print("세로입력 : ");
        int y = sc.nextInt();
            //여기서 캐스팅 시 물고기가 잡혔는지 체크
        if(pool[y][x]>1){
            System.out.println("물고기를 잡았습니다!");
            pool[y][x] =0;
            fishcount--;
        }

        while(fishcount>0){
            //4. 맵 위치 출력
            for(int i=0; i<ysize; i++){
                for(int j=0; j<xsize; j++){
                    if(pool[i][j]>0){
                        System.out.print("★\t");
                    }else if(i==y&&j==x){
                        System.out.print("X\t");
                    }
                    else {
                        System.out.print("○\t");
                    }
                }
                System.out.println();
            }

            //5.위치이동
            System.out.println("위치를 이동해주세요");
            System.out.println("1.위 2.아래 3.왼쪽, 4.오른쪽");
            System.out.print("입력 : ");
            int input = sc.nextInt() -1;
            int nx = x+xd[input];
            int ny = y+yd[input];


            if(ny>=0&&ny<ysize&&nx>=0&&nx<xsize){
                x = nx;
                y = ny;
                if(pool[ny][nx]>0){
                    System.out.println("물고기를 잡았습니다!");
                    pool[ny][nx] = 0;
                    fishcount--;
                }
            }else{
                System.out.println("다시 입력해주세요");
            }
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
