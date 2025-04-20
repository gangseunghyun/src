package DAY05.DAY05;

import java.util.Random;
import java.util.Scanner;

/*
숫자 야구게임
랜덤 변수 3자리 -> 중복되면 안됨 okay
입력 세개okay -> 틀릴때마다 반복 -> while문 안에 넣어야함.
옳은 입력 -> 각각의 수가 같지 않아야하고 1~9 안에 들어가야함
자리와 숫자가 맞으면 strike
숫자만 맞으면 ball

나머지 홈런

 */
public class Q4_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int [] check = new  int [3];

        while (check[0]==check[1] || check[0] == check[2] || check[1] == check[2]){
            int ran1 = r.nextInt(9)+1;
            int ran2 = r.nextInt(9)+1;
            int ran3 = r.nextInt(9)+1;

            check [0] = ran1;
            check [1] = ran2;
            check [2] = ran3;

        }
        System.out.println(check[0]+","+check[1]+","+check[2]);






    }
}
