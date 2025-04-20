package DAY03;

import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        System.out.print(num + "의 약수는 ");

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ",");
            }
        }
            System.out.print(num + " 입니다.");


        }
    }

