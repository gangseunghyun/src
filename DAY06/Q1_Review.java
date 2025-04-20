package DAY06;

/*
로또 추출기 1-45 숫자 중복값 x


 */

import java.util.Random;

public class Q1_Review {
    public static void main(String[] args) {
        Random r = new Random();
        int [] lottery = new int[6];

        for (int i = 0; i < lottery.length;i++) {
            lottery[i] = r.nextInt(45) + 1;
            /*
            for (int i = 1; i < lottery.length;i++){
             if (lottery[i-1]==lottery[i]){
                 i--;
             }

             */
            for (int j = 0; j < i; j++)
                if (lottery[i] == lottery[j]) {
                    i--;
                    break; // break를 거는 이유는 중복을 발견한 순간 j++을 멈추고 (필요없는 비교) for문을 빠져나감.
                }
            System.out.print(lottery[i]+" ");
        }

        }



    }

