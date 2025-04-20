package Day02;

public class StringTest {
    public static void main(String[] args) {
        String str = "안녕하세요";
        System.out.println(str);
        String str1 = 15 + 16 +""; //에러가 X
        String str2 = "안녕하세요"+5+3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 + 10 + 10); // "3110"
    }
}
