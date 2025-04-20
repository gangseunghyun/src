package DAY06;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] random = new int[6];  // 0 1 2 3 4 5

        for (int i = 0; i < 6; i++) { // 6번 돌리겠다는 뜻
            random[i] = r.nextInt(45) + 1; // random[i] 에 랜덤 숫자 입력
            for (int j = 0; j < i; j++) { // 중복 제거
                if (random[i] == random[j]) {
                    i--;
                    break;
                }

            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (random[i] > random[j]) {
                    int temp = random[j];
                    random[j] = random[i];
                    random[i] = temp;
                }
            }
        }


        for (int i = 0; i < 6; i++) {
            System.out.print(random[i] + ",");
        }
    }
}
