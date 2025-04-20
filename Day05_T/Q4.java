package Day05_T;

import java.util.Random;

/*
변수 3개가 있고 랜덤 값을 입력 받고
단, 모든 변수에 값이 같으면 안된다.
 */
public class Q4 {
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
