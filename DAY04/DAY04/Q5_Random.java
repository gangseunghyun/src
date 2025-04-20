package DAY04.DAY04;
/*
0~25

1. 랜덤값 추출
2. 랜덤 문자 작업 10번 실행
3.10개 문자를 더하기 연산하여 하나의 문자열로 만듦.

*/


import java.util.Random;

public class Q5_Random {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 1; i <= 10; i++) {
            int num = r.nextInt(26) + 65;
            char ch = (char) num;
            String str = "";
            str += ch;
            System.out.print(str);
        }


    }
}
