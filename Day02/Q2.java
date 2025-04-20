package Day02;

import java.util.Scanner;

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

1. 숫자 2개 입력
2. 더하기 연산 후 출력...(나머지 연산까지 출력)
 */
public class Q2 {
    public static void main(String[] args) {
        //1. 입력이 필요해서 입력 준비
        Scanner sc = new Scanner(System.in);
        //2. 숫자 2개 입력
        System.out.print("숫자1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 : ");
        int num2 = sc.nextInt();
        //3. 연산 값 출력
        System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +(num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " +(num1 * num2));
        System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
        System.out.printf("%d %% %d = %d",num1,num2,num1%num2);
    }
}
