package DAY07;

import java.util.Random;
import java.util.Scanner;

public class taehyun_fish_method {
    public static int x = 0;
    public static int y = 0;
    public static int ysize = 0;
    public static int xsize = 0;
    public static int[][] InitData(Scanner sc){
        System.out.println("호수 크기를 입력해주세요");
        System.out.print("가로 : ");
        xsize = sc.nextInt();
        System.out.print("세로 : ");
        ysize = sc.nextInt();
        int  [][] lake = new int[ysize][xsize];
        return lake;
    }
    public static void MoveUser(Scanner sc, int fishcount,int[][] lake){
//        반복 시작
        int [] xd  = {0,0,-1,1}; //위, 아래, 왼쪽, 오른쪽
        int [] yd = {-1,1,0,0}; //위, 아래, 왼쪽, 오른쪽

        while(fishcount>0){
            //4. 맵 위치 출력
            for(int i=0; i<ysize; i++){
                for(int j=0; j<xsize; j++){
                    if(lake[i][j]>0){
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
            if(input>4||input<0){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            int nx = x+xd[input];       //다음 이동할 좌표를 변수에 넣어두기
            int ny = y+yd[input];       //다음 이동할 좌표를 변수에 넣어두기

            //이동할 좌표가 갈 수 있는 좌표인지 확인해서 갈수있으면 실행
            if(ny>=0&&ny<ysize&&nx>=0&&nx<xsize){
                x = nx; //다음 이동할 좌표 현재좌표로 적용
                y = ny; //다음 이동할 좌표 현재좌표로 적용
                if(lake[ny][nx]>0){
                    System.out.println("물고기를 잡았습니다!");
                    System.out.println();
                    lake[ny][nx] = 0;
                    fishcount--;
                }
            }else{
                System.out.println("다시 입력해주세요");
            }
            System.out.println("===========================================");
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }

    public static int Casting(Scanner sc,int [][] pool){
        //3. 캐스팅
        int fishcount = 3;
        System.out.println("캐스팅 할 위치를 지정 해 주세요");
        System.out.print("호수 크기 - ");
        System.out.println("가로 : "+xsize+", 세로 : "+ysize);
        System.out.print("가로입력 : ");
        x = sc.nextInt();       //캐스팅(첫 x좌표) 좌표 받기
        System.out.print("세로입력 : ");
        y = sc.nextInt();       //캐스팅(첫 y좌표) 좌표 받기
        //여기서 캐스팅 시 물고기가 잡혔는지 체크
        if(pool[y][x]>1){
            System.out.println("물고기를 잡았습니다!");
            pool[y][x] =0;
            fishcount--;
        }
        return fishcount;
    }
    public static int SetFish(Scanner sc,int [][] lake){

        Random random = new Random();
        System.out.print("물고기 수를 정해주세요 : ");
        int fishcount = sc.nextInt();
        for(int i=0; i<fishcount; i++){
            //물고기 넣을 xy좌표 생성
            int xtemp = random.nextInt(xsize);
            int ytemp = random.nextInt(ysize);

            //좌표에 물고기 넣기(원래 들어있으면 i--)
            if(lake[ytemp][xtemp]==0){
                lake[ytemp][xtemp] = 1;
            }else {
                i --;
            }
        }
        return fishcount;
    }
    public static void Mainpage(){
        Scanner sc = new Scanner(System.in);
//        1. 호수크기정하기
        int [][] lake = InitData(sc);
//        2.물고기 세팅하기
        int fishcount = SetFish(sc,lake);
//        3. 캐스팅하기
        Casting(sc,lake);
//        4. 사용자 움직이기
        MoveUser(sc,fishcount,lake);
    }

    public static void main(String[] args) {
        Mainpage();
    }
}
