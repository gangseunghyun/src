package DAY05;

/*
숫자 야구게임
랜덤 변수 3자리 -> 중복되면 안됨 okay
입력 세개okay -> 틀릴때마다 반복 -> while문 안에 넣어야함.
옳은 입력 -> 각각의 수가 같지 않아야하고 1~9 안에 들어가야함
자리와 숫자가 맞으면 strike
숫자만 맞으면 ball

나머지 홈런

 */


import java.util.Random;
import java.util.Scanner;

public class Q3More {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ran1 = r.nextInt(9) + 1;
        int ran2 = r.nextInt(9) + 1;
        int ran3 = r.nextInt(9) + 1;


        while (ran1 == ran2 || ran1 == ran3 || ran2 == ran3) { // 난수가 중복되지 않게 처리
            ran1 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
            ran3 = r.nextInt(9) + 1;
        }


        while (true) { // 입력하는 값이 반복되도록

            System.out.print("첫째자리 : "); // 내가 입력하는 값
            int num1 = sc.nextInt();

            System.out.print("둘째자리 : ");
            int num2 = sc.nextInt();

            System.out.print("셋째자리 : ");
            int num3 = sc.nextInt();


            //잘못된 입력은 합쳐서 묶어버리기
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("중복 값입니다.");
            }
            else if  (num1 > 0 && num1 < 10 && num2 > 0 && num2 < 10 && num3 > 0 && num3 < 10) { // 옳바른 입력에서 경우의 수 따지기
               if ((ran1 == num1 || ran2 == num2 || ran3 == num3)){// ball 상황


                }
                else if (ran1 != num1 && ran2 != num2 && ran3 != num3) { //모두 불일치로 out
                    System.out.println("out 입니다.");
                }

                else if (ran1 == num1 && ran2 == num2 && ran3 == num3) { // 모두 일치로 홈런일때만 탈출 가능
                    System.out.println("홈런입니다.");
                    break;

                } else System.out.println("잘못된 입력입니다.");


            }


        }
    }
}
