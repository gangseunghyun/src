package DAY08;

/*
문자 A(65)에서
랜덤 0~25값 추출 - 주고 안받고
그 값에서 65를 더해서 - 주고 받고
문자로 만들기 - 주고 받고
이거를 10번 실행 하여 - 안주고 안받고
10개 문자를 더하기 연산 - 주고 받고
10개 문자 출력 - 안주고 받고
 */


import java.util.Random;

public class Q3 {

    //랜덤 값 추출 0~25 의 숫자가 랜덤으로 한개 추출됨. return ran에 그 숫자가 들어감.
    static int random (){
        Random r = new Random();
        int ran = r.nextInt(26);
        return ran;
    }

    //65 더하기 int a에 숫자를 넣으면 그 숫자와 65가 더해져 num에 들어감
    static int plus (int a){
        int num = a+65;
        return num;
    }

    //문자로 변환 int a에 숫자를 넣으면 알파벳으로 바꿔줌.
    static char change (int a){
        char ch = (char) a;
        return ch;
    }

    static char [] rannum = new char[10];
    //10번 실행 rannum에 10개의 문자를 저장.
    static void re (){
        for (int i =0 ; i<10;i++){
            rannum[i] =change(plus(random()));
            System.out.println(rannum);
        }
    }
    //10개 문자를 더하기 연산 주고 받고
    static String wordplus () {
        String plus = "";
        for (int i = 0; i < 10; i++) {
            plus += rannum[i];
        }
        return plus;
    }

    //10개 문자 출력 안주고 받고
    static void output (String ten){
        System.out.println(ten);
    }




    public static void main(String[] args) {

        System.out.println(wordplus());
    }
}
