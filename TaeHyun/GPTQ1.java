package TaeHyun;

/*
0세 이하 또는 120세 초과 → "나이를 잘못 입력했습니다." 출력하고 종료

0 ~ 3세: 무료

4 ~ 12세: 5,000원

13 ~ 18세: 7,000원

19 ~ 64세: 10,000원

65세 이상: 3,000원
 */

import java.util.Scanner;

public class GPTQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("나이를 잘못 입력했습니다.");
        } else if (age >= 0 && age <= 3) {
            System.out.println("입장요금은 무료입니다.");
        } else if (age >= 4 && age <= 12) {
            System.out.println("입장요금은 5,000원 입니다.");
        } else if (age >= 13 && age <= 18) {
            System.out.println("입장요금은 7,000원 입니다.");
        } else if (age >= 19 && age <= 64) {
            System.out.println("입장요금은 10,000원 입니다.");
        } else System.out.println("입장요금은 3,000원 입니다. 할인 대상입니다.");

    }
}
