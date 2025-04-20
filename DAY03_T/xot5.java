package DAY03_T;

import java.util.Random;
import java.util.Scanner;

public class xot5 {
    public static void main(String[] args) {

        //1. 호수크기 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("호수 크기를 입력해주세요");
        System.out.print("가로 : ");
        int [] xd  = {0,0,-1,1}; //위, 아래, 왼쪽, 오른쪽
        int [] yd = {-1,1,0,0}; //위, 아래, 왼쪽, 오른쪽
//        예시
//        우측으로 한칸 움직이려고 할 때
//        x축에다가 +1, y축에다가 +0
//        이런 패턴을 배열에 담아서
//        x = x+xd[3];      현재x축 변수에 xd[3](1)넣기
//        y = y+yd[3];      현재y축 변수에 yd[3](1)넣기


        int xsize = sc.nextInt();
        System.out.print("세로 : ");
        int ysize = sc.nextInt();
        int  [][] pool =new int[ysize][xsize];
        int fishcount = 3;

        //2. 물고기 세팅
        Random random = new Random();
        for(int i=0; i<fishcount; i++){
            //물고기 넣을 xy좌표 생성
            int xtemp = random.nextInt(xsize);
            int ytemp = random.nextInt(ysize);

            //좌표에 물고기 넣기(원래 들어있으면 i--)
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
        int x = sc.nextInt();       //캐스팅(첫 x좌표) 좌표 받기
        System.out.print("세로입력 : ");
        int y = sc.nextInt();       //캐스팅(첫 y좌표) 좌표 받기
            //여기서 캐스팅 시 물고기가 잡혔는지 체크
        if(pool[y][x]>1){
            System.out.println("물고기를 잡았습니다!");
            pool[y][x] =0;
            fishcount--;
        }

//        반복 시작
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
            int nx = x+xd[input];       //다음 이동할 좌표를 변수에 넣어두기
            int ny = y+yd[input];       //다음 이동할 좌표를 변수에 넣어두기

            //이동할 좌표가 갈 수 있는 좌표인지 확인해서 갈수있으면 실행
            if(ny>=0&&ny<ysize&&nx>=0&&nx<xsize){
                x = nx; //다음 이동할 좌표 현재좌표로 적용
                y = ny; //다음 이동할 좌표 현재좌표로 적용
                if(pool[ny][nx]>0){
                    System.out.println("물고기를 잡았습니다!");
                    System.out.println("===========================================");
                    System.out.println();
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
