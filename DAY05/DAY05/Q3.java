package DAY05.DAY05;
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

        int num1 = r.nextInt(9)+1;
        int num2 = r.nextInt(9)+1;
        int num3 = r.nextInt(9)+1;

            if (num1 != num2 ) {
                System.out.print(num1+","+num2+",");}

        while (num2 == num3 || num1 == num3){
            num3 = r.nextInt(9)+1;
                if (num2 != num3 && num1 != num3) {
                    System.out.println(num3);
                }
            }
        System.out.println(num3);
        }
    }
