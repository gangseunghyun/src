package Day06_T;
/*
1. 랜덤 객체 생성
2. 배열 생성
3. 배열에 랜덤 값 넣기
4. 최대 값 구하기
5. 최대 값 인덱스 출력
 */

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        //1. 랜덤 객체 생성
        Random r = new Random();
        //2. 배열 생성
        int[] array = new int[10];
        //3. 최대값 변수 생성
        int max = 0;
        //4. 배열 랜덤값 넣기
        for (int i = 0;i<array.length;i++){
            array[i] = r.nextInt(11);
            if(max < array[i]){
                max = array[i];
            }
            System.out.println("arr["+i+"] : "+array[i]);
        }
        for(int i =0;i<array.length;i++){
            if(max == array[i]){
                System.out.println("index : "+i);
            }
        }
    }
}
