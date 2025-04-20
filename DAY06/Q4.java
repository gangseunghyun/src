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

public class Q4 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] ran = new int[10];
        int max = 10;


        for (int i = 0; i < ran.length; i++) { // 배열 수만큼 반복
            ran[i] = r.nextInt(11); // ran이라는 배열에 랜덤숫자 넣기
        }
        for (max = 10; max >= 0; max--) {
            for (int i = 0; i < ran.length; i++) {
                if (ran[i] == max) {
                    System.out.print(i);
                    break;
                }
            }

        /*
        for (int i = 0 ; i< ran.length;i++){
            for (int j = i+1; j< ran.length-1;j++){
            if (ran[i] >ran[j]){

            }

            }

        }


*/


        }
    }
}
