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

public class Q4_Review {
    public static void main(String[] args) {

        Random r = new Random();
        int [] ran = new int[10];


        int max = 0;
        int i = 0;

        for (i = 0; i< ran.length; i++){
            ran[i] = r.nextInt(11);
            if (ran[i]>=max){
                max=ran[i];
            }
            System.out.println("arr["+i+"] : "+ran[i]);

        }


        for (i=0;i< ran.length;i++){
            if (max == ran[i]){
                System.out.println("index : "+i);
                System.out.println("최대값 : "+ran[i]);
            }
        }

    }
}
