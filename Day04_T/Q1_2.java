package Day04_T;

import java.util.Scanner;

public class Q1_2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        //2. 출력
        //문자열에 담아야겠다
        //짝수 문자열, 홀수 문자열
        String jj = "";
        String hh = "";
        for(int i = 1;i<num;i++){
            if(i % 2 == 0){
                jj += i+" ";
                // jj = jj + i + " ";
            }
            else{
                hh += i + " ";
            }
        }
        System.out.println("짝수 : "+jj);
        System.out.println("홀수 : "+hh);
    }
}
