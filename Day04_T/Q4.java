package Day04_T;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        //10개의 영어 대문자를 만들어서 출력
        // 특정이 되어 있지 않다 -> 난수
        //문자열 변수에 받아서 출력
        Random r = new Random();
        char ch = 'A';
        String str = "";
        for(int i = 0;i<10;i++){
            int num = r.nextInt(26);
            System.out.print((char)(ch + num));
        }
        System.out.println();
        for(int i = 0;i<10;i++){
            System.out.print((char)('A'+r.nextInt(26)));
        }
        System.out.println();
        for(int i = 0;i<10;i++){
            str += (char)('A' + r.nextInt(26));
        }
        System.out.println(str);
        str = "";
        for(int i = 0;i<10;i++){
            ch += r.nextInt(26);
            str += ch;
            ch = 'A';
        }
        System.out.println(str);
    }
}
