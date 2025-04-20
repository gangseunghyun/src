package Day07_T;

import java.util.Random;
import java.util.Scanner;

/*
1. 호수만들기[5][5], 입력 객체 생성, Random 객체생성, 입력에 필요한 캐스팅 정수 변수 2개 생성, 물고기 카운터 변수 생성
2. 호수에 물고기 배치 3마리 중복허용 X
3. 캐스팅
4. 물고기 잡았는지 여부 확인
5. 물고기, 호수 출력
------------------------------------------------
무한루프
6. 1.위 2.아래 3.왼쪽 4.오른쪽
7. 캐스팅 된 좌표에서 위 아래 왼쪽 오른쪽 이동
   7-1 이동을 할 수 있는지 여부 확인
   7-2 이동이 X 안된다고 출력
   7-3 이동할 수 있으면 좌표 이동
8. 물고기 잡았는지 여부 확인
   8-1 물고기 잡았으면 물고기 카운터 변경
   8-2 물고기 못 잡으면 좌표이동
6번으 이동
물고기 숫자 0이 되면 탈툴
물고기를 모두 잡았습니다. (종료)
 */
public class Q3 {
    public static void main(String[] args) {
        //1.
        int[][] hosu = new int[5][5]; // 호수 초기화 0 -> 1바꿔서 물기 위치를 나타낸다
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int y; //행 좌표
        int x; //열 좌표
        int fishCount = 0; // 물고기가 배치가 올바르게 되면 3이 되게 해서 게임시작
        //2. 호수에 물고기 배치
        for(int i = 0;i<3;i++){
            int fy = r.nextInt(5);
            int fx = r.nextInt(5);
            if(hosu[fy][fx] == 0){
                hosu[fy][fx] = 1;
                fishCount++;
            }
            else{
                i--;
            }
        }
        //3. 물고기 배치된 호수 출력
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
        //4. 캐스팅
        while (true){
            System.out.print("행 입력 : ");
            y =sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
            if(y > -1 && y < 5 && x > -1 && x <5){
                break;
            }
        }
        System.out.println("y : "+y+", x : "+x);
        //5.물고기 잡았는지 확인
        if(hosu[y][x] == 1){
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = 0;
            fishCount--;
        }
        //6. 출력
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(i == y && j == x){
                    System.out.println("X");
                }
                else if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
        while (fishCount > 0){
            //7. 위 아래 왼쪽 오른쪽 입력
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            //8. 이동 확인
            if(num == 1){
                y--;
                if(y < 0){
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    y = 0;
                }
            }
            else if(num == 2){
                y++;
                if(y > 4){
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    y = 4;
                }
            }
            else if(num == 3){
                x--;
                if(x < 0){
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 0;
                }
            }
            else if(num == 4){
                x++;
                if(x > 4){
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }

            //9. 물고기 확인
            if(hosu[y][x] == 1){
                System.out.println("물고기를 잡았습니다.");
                hosu[y][x] = 0;
                fishCount --;
            }
            //10.출력
            for(int i = 0;i<hosu.length;i++){
                for(int j = 0;j<hosu[i].length;j++){
                    if(i == y && j == x){
                        System.out.println("X");
                    }
                    else if(hosu[i][j] == 0){
                        System.out.print("○");
                    }
                    else{
                        System.out.print("●");
                    }
                }
                System.out.println();
            }
        }
        // 물고기 모두 잡았다.
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
