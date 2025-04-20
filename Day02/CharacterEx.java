package Day02;

public class CharacterEx {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1);// 강제 형변환 char -> int : 65

        char ch2 = 66;
        System.out.println(ch2);// B

        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char)ch3); // 강제 형변환 int - > char : C

        char kor = '각';
        System.out.println((int)kor);



    }
}
