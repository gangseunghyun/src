package Day05_T;

import java.util.Random;
import java.util.Scanner;

public class Q5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        int[] com = new int[3];
        //중복제거 랜덤수 삽입
        // [0] -> [1] [2]
        // [1] -> [0] [2]
        // [2] -> [0] [1]
        // [0] [1] [2]
        for(int i =0;i<3;i++){
            com[i] = r.nextInt(9)+1; // 0 -> 7 1 -> 7 0~2번방에 1~9까지 랜덤 숫자를 넣어준다
            for(int j =0;j<i;j++){
                if(com[i] == com[j]){ // com[1] == com[0]
                    i--; // 1 -> 0
                    break;
                }
            }
        }
        for(int i = 0;i<3;i++){
            System.out.print(com[i]+" ");
        }
        System.out.println();
        int strike = 0;
        int ball = 0;
        int[] user = new int[3];
        while(strike < 3){
            //입력
            for(int i = 0;i<3;i++){
                System.out.print(i+1+"자리 : ");
                user[i] = sc.nextInt(); //9
                //1. 1~9아닌경우 다시 입력
                if(user[i] < 1 || user[i] > 9){
                    i--;
                    continue;
                }
                //2. 중복이 있는 경우 다시 입력
                for(int j =0;j<i;j++){
                    if(user[i] == user[j]){ // com[1] == com[0]
                        i--; // 1 -> 0
                        break;
                    }
                }
            }
            //strike ball 계산
            strike = 0;
            ball = 0;
            for(int i = 0;i<3;i++){ //user
                for(int j = 0;j<3;j++){ //com
                    if(user[i] == com[j]){
                        //strike ball
                        if(i == j){
                            strike++;
                        }
                        else{
                            ball++;
                        }
                    }
                }
            }
            if(strike == 0 && ball == 0){
                System.out.println("Out 입니다.");
            }
            else if(strike == 3){
                System.out.println("홈런입니다. 축하합니다.");
            }
            else{
                System.out.println("strike : "+strike+", ball : "+ball);
            }
        }
    }
}
