package Day06_T;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        //1. 랜덤 객체 생성
        Random r = new Random();
        //2.배열 생성
        int[] array = new int[5];
        //3. 배열에 중복되지 않는 값 1~9 난수 대입
        for(int i =0;i<5;i++){
            array[i] = r.nextInt(9)+1;
            for(int j = 0;j<i;j++){
                if(array[i] == array[j]){
                    i--;
                    break;
                }
            }
        }
        //4. 정렬전 배열 출력
        System.out.println("정렬전");
        for(int i = 0;i<5;i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
        //5. 배열 정렬
        System.out.println("================================");
        for(int i = 0;i<4;i++){
            for(int j = i+1;j<5;j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("정렬후");
        for(int i = 0;i<5;i++){
            System.out.println("array["+i+"] : "+array[i]);
        }

    }
}
