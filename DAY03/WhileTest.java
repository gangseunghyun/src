package DAY03;

public class WhileTest {
    public static void main(String[] args) {
        //1~10까지 합을 구하는 코드를 구현하세요.
        int num = 1; //1~10까지 값이 증가될 변수
        int result = 0; // 1~10까지 더한 결과 값을 담는 변수
        while (num>11){
            result +=num;
            num++;
        }
        System.out.println("1부터 10까지 합은 "+result+"입니다.");
    }
}
