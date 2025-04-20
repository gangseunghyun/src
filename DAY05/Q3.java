package DAY05;
/*
1~9까지의 랜덤 수 부여
각각의 변수 숫자가 다르게 구현
숫자가 다를때까지 반복
랜덤 수 3개 출력
 */

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {

        Random r = new Random();
        int ran1 = r.nextInt(9)+1;
        int ran2 = r.nextInt(9)+1;
        int ran3 = r.nextInt(9)+1;
        /*
        while (true){
            ran1 = r.nextInt(9)+1;
            ran2 = r.nextInt(9)+1;
            ran3 = r.nextInt(9)+1;

            if(ran1 != ran2 && ran1 != ran3 && ran2 != ran3){
                break;
            }
        }
        */
        while(ran1 == ran2 || ran1 == ran3 || ran2 == ran3){
            ran1 = r.nextInt(9)+1;
            ran2 = r.nextInt(9)+1;
            ran3 = r.nextInt(9)+1;
        }
        System.out.println(ran1+","+ran2+","+ran3);

    }
}
