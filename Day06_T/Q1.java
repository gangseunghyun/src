package Day06_T;

/*
1~45 랜덤수를 만들고 중복이 되지 않게 하세요.
-> 정렬을 하면 좋습니다.
 */

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[6];

        for(int i =0;i<6;i++){
            array[i] = r.nextInt(45)+1;
            for(int j =0;j<i;j++){
                if(array[i] == array[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0;i<6;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //비교를 하고 바꾸려면
        // 기준과 비교대상 반분문 2개 있어야 됩니다.
        for(int i = 0;i<5;i++){ // 0                1         2 3 4
            for(int j = i+1;j<6;j++){ // 1 2 3 4 5  2345
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for(int i = 0;i<6;i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
    }
}
