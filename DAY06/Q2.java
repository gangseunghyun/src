package DAY06;

/*
배열 크기 5
랜덤 1~9 중복x

 */


import java.util.Random;

public class Q2 {
    public static void main(String[] args) {

        Random r = new Random();
        int [] random = new int[5];
        int ran = r.nextInt(9)+1;

        for (int i = 0; i<5; i++){ // 배열 크기가 5개기 때문에 5번까지 반복
            random[i] = r.nextInt(9)+1; // 랜덤이라는 아파트에 랜덤의 숫자를 입력
            for (int j = 0 ; j<i ; j++){ // i와 i-1의 숫자 비교
                if (random[i] == random[j]){
                    i--;  // 중복시 다시 같은 i에서 랜덤값 뽑기
                    break;
                }
            }
        }

        for (int i = 0; i<4 ; i++){
            for (int j = i+1;j<5;j++){
                if (random[i]>random[j]){ // if random1->3 random2->1 랜덤2를 랜덤1로 넣어야함.
                    int temp = random[i];
                    random [i] = random[j];
                    random [j] = temp;
                }
            }
        }

        for (int i = 0;i<5;i++){
            System.out.print(random[i]+",");
        }




    }
}
