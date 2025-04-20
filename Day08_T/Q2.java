package Day08_T;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1.사각형 넓이 2.삼각형 넓이 3.종료 : ");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("1. 가로 : ");
                int w = sc.nextInt();
                System.out.print("2. 세로 : ");
                int h = sc.nextInt();
                System.out.println("사각형 넓이 : "+w*h);
            }
            else if(num == 2){
                System.out.print("1. 가로 : ");
                int w = sc.nextInt();
                System.out.print("2. 세로 : ");
                int h = sc.nextInt();
                System.out.println("사각형 넓이 : "+w*h/2);
            }
            else if(num == 3){
                System.out.println("프로그램 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
