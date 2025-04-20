package DAY06;

import java.util.Scanner;

/*
a,b의 최소공배수 최대공약수 구하기


구조
1. 두가지 수 입력 받기
2. 두가지 수에서 나머지값 ->r
3. 반복문으로 두가지 수 중에서 작은수 / r 이때의 나머지값이 0이 아니면 r이 작은수가 됨.
이 반복의 나머지가 0이 될때까지
4. 반복문 안에 if문에서 위의 나머지가 0이 되면 그 마지막 수를 찍고 탈출


구하는 방법
1. a와 b 중에 더 큰수/작은수 -> 나머지 값 : r
1-1 a와 b중 더 큰지 작은지 if로 구분. 나머지값은 %연산자 사용
2. 작은수/r -> 나머지가 0이 될때까지 반복
2-1 while 반복문으로 0이 될때가지 반복
3. 마지막에 나누는 수가 최대 공약수
3-1. 마지막 수를 찍고 반복문 나가기

0이하는 잘못된 입력

 */
public class Q3_Review {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int input1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int input2 = sc.nextInt();

        int r;  //나머지값
        int a = input1;
        int b = input2;

        while (true){
            r = a%b;
            if (r == 0){
                break;
            }
            a=b;
            b=r;
                }
            }

        }



