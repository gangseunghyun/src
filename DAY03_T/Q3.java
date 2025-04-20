package DAY03_T;

import java.util.Scanner;

/*
1. 숫자 입력
2. 약수 출력
입력한 값과 1은 무조건 약수
 */
public class Q3 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        //System.out.println("8의 약수는 1,2,4,8입니다.");
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        //2. 약수 출력
        // 8 -> 1,2,3,4,5,6,7,8 입력한 값과 나누어서 나머지가 0이면 약수
        // 10 -> 1,2,3,4,5,6,7,8,9,10
        System.out.print(num+"의 약수는 "); // x약수는
        for(int i = 1;i<num;i++){
            //확인
            if(num % i == 0){
                System.out.print(i+","); // 1, 2, 4,
            }
        }
        System.out.print(num+"입니다.");
    }
}
