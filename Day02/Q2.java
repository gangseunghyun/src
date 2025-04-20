package Day02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /* 숫자가 두개
        숫자를 +,-,/,% 로 결과값
         */
        Scanner num1 = new Scanner(System.in);
        System.out.print("숫자1 : ");
        int a = num1.nextInt();
        System.out.print("숫자2 : ");
        int b = num1.nextInt();
        System.out.println(a + " + " + b + " = " +(a+b));
        System.out.println(a + " - " + b + " = " +(a-b));
        System.out.println(a + " * " + b + " = " +(a*b));
        System.out.println(a + " / " + b + " = " +(a/b));
        System.out.println(a + " % " + b + " = " +(a%b));

        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d %% %d = %d",a,b,a/b);

    }
}
