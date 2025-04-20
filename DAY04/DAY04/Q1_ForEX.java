package DAY04.DAY04;

/*
숫자 입력 : 10
짝수 : 2 4 6 8
홀수 : 1 3 5 7 9

1. 입력준비
2. 변수입력
3. 조건
3-1. num 이하의 짝수 출력  2를 나눴을때 나머지 0
 홀수 입력 2를 나눴때 디폴트 1 , 2 나눴을때 나머지 1
 */


import java.util.Scanner;

public class Q1_ForEX {
    public static void main(String[] args) {

        //입력준비
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        //변수입력
        int num = sc.nextInt();
        //조건 반복
        System.out.print("짝수 : ");

        for (int i = 1; i<num ; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.print("\n홀수 : ");

        for (int i = 0; i<num ; i++){
            if (i% 2 == 1) {
                System.out.print(i+ " ");
            }
        }







    }
}
