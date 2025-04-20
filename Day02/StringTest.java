package Day02;

public class StringTest {
    public static void main(String[] args) {
        String str = "안녕하세요";
        System.out.println(str); // 안녕하세요
        String str1 = 15 + 16 + ""; //에러가x
        String str2 = "안녕하세요"+5+3;

        System.out.println(str1); // "31"
        System.out.println(str2); // "안녕하세요53"
        System.out.println(str1 +10); //"31"10
    }
}
