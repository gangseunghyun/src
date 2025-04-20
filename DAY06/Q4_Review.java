package DAY06;
/*
1차원 배열
배열 크기 10개
각각 배열안에 값이 0~10까지 랜덤 추출
배열안의 값 중에 가장 큰값이 몇번째 index에 있는지 출력하시오.
가장 큰값이 같은 값이 있으면 index를 같이 출력해주세요.

1. 랜덤값 추출
2. 배열에 숫자 10개를 넣고
3. 그중에 최대값 찾기

 */
import java.util.Random;
import java.util.Scanner;

public class Q4_Review {
    public static void main(String[] args) {

        Random r = new Random();
        int [] array = new int[10];
        int i = 0;
        int max=0;

        for (i = 0; i<array.length ; i++){
            array[i] = r.nextInt(11);
            if (max<array[i]){
                max=array[i];
            }System.out.println("array["+i+"] : "+array[i]);
        }

        for (i=0; i< array.length;i++){
            if (max==array[i]){
                System.out.println("index : "+i);
            }
        }



    }
}
