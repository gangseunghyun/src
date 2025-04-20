package DAY09;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    /*
    숫자야구게임 배열 (함수화)
    user의 값을 입력 받는 부분 / com random 받는 부분 함수화(주는 부분을 배열 처리) -> return값
    user 배열과 com 배열을 비교해서
    strike,ball,out을 판단하는 함수 만들때 받는 부분을 배열들어가서 비교. ->매개변수
     */

    //유저 입력값
    static int[] users(Scanner sc) {
        int[] users = new int[3];
        while (true) {
            System.out.print("첫째 자리 : ");
            users[0] = sc.nextInt();
            System.out.print("둘째 자리 : ");
            users[1] = sc.nextInt();
            System.out.print("셋째 자리 : ");
            users[2] = sc.nextInt();
            //잘못된 입력시 반복
            if (users[0] == users[1] || users[0] == users[2] || users[1] == users[2] ||
                    users[0] < 1 || users[0] > 9 || users[1] < 1 || users[1] > 9 || users[2] < 1 || users[2] > 9) {
                System.out.println("잘못된 입력입니다.");
            }
            else break;
        }return users;
    }

    static int [] coms (Random r) {
        int[] coms = new int[3];
        for (int i=0; i < coms.length; i++) {
            coms[i] = r.nextInt(9)+1;
            for (int j = 0; j < i; j++) {
                if (coms[i] == coms[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("COM : "+coms[0]+" "+coms[1]+" "+coms[2]);

        return coms;
    }
    static int [] compare (int [] users,int [] coms ){

        int [] result = new int [2];
        for (int i =0; i<3;i++){
            for (int j=0;j<3;j++){
                if (users[i]==coms[j]){
                    if (i==j) {
                        result[0]++;
                    }
                    else result[1]++;

                }
            }
        }
        return result;
    }

    static int result (int [] compare){
        int result=0;
        if(compare[0] == 3){
            System.out.println("홈런입니다.");
            result=3;
        } else if (compare[0]==0 && compare[1] ==0) {
            System.out.println("아웃입니다.");

        }else System.out.println("STRIKE : "+compare[0]+", BALL : "+compare[1]);
        return result;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] coms = coms(r);
        int[] users = users(sc);

       while (result(compare(users,coms))!=3){  //홈런의 결과값
           users = users(sc);
       }



    }
}
