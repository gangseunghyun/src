package Day02;

/*
숫자를 2개 입력
입력 후 더하기 빼기 곱하기 나누기 나머지연산 결과 값 출력
예)
숫자 1 : 10(엔터)
숫자 2 : 5(엔터)
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
10 % 5 = 0


1. 숫자 2개 입력준비
2. 연산자 대입 후 출력

 */

import java.util.Scanner;

public class Q2_Review {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자2 : ");
        int num2 = sc.nextInt();

        System.out.println(num1+" + "+num2+" = "+(num1+num2));

        System.out.println(num1+" - "+num2+" = "+(num1-num2));

        System.out.println(num1+" * "+num2+" = "+(num1*num2));

        System.out.println(num1+" / "+num2+" = "+(num1/num2));

        System.out.println(num1+" % "+num2+" = "+(num1%num2));

    }

}
