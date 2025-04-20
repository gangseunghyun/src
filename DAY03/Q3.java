package DAY03;

/*
숫자를 입력받기 -> 입력받은 숫자의 약수를 출력하는 프로그램을 만들어주세요.

ex) 8의 약수
8의 약수는 1,2,4,8 입니다.

1. 입력 준비
2. 입력문
3. 변수 입력
3-1. 변수 조건 - 약수 숫자를 나눴을때 나머지 값이 0. %연산자 사용
4. 결과값 출력
 */


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in); // 입력 준비
        System.out.print("숫자 입력 : ");
        int num1 = scr.nextInt();

        System.out.print(num1+"의 약수는 ");

        for (int i = 1;i<num1;i++){
            if (num1 % i == 0 ){
                System.out.print(i+",");
            }


        }
        System.out.println(num1+" 입니다.");

    }
}
