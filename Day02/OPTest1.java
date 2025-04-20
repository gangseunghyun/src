package Day02;

public class OPTest1 {
    public static void main(String[] args) {
        //1. 산술연산자
        int mathScore = 90;
        int engScore = 70;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore); //160
        double avgScore = totalScore / 2.0; // 자동형변환 160 / 2.0
        System.out.println(avgScore); //80.0

        System.out.println(6912394 % 3); //나머지 연산자

        int a = 10;
        System.out.println(a++); //후치 10
        System.out.println(++a); //전치 12

        //2. 관계연산자

        int b = 10;
        int c = 12;
        int d = 10;

        System.out.println(b == c); // false
        System.out.println(b != c); // true
        System.out.println(b >= c); // false
        System.out.println(d <= c); // true
        System.out.println(c < b); // false

        //3. 논리연산자
        System.out.println(5>3 && 4 == 7 || 3 != 7);
        // a++ =>a =  a + 1
        //System.out.println(a++ > ++c && d-- != c++ && b-- == d++);
        //4. 단축연산자
        int e = 10;
        int f = 5;
        e += f;
        System.out.println(e);
        e -= f;
        System.out.println(e);
        //5. 삼항연산자
        int x = (e == 10 ? (c == 20 ? 5 : (f == 5? 9 : 13)) : 0);
        System.out.println(x);
    }
}
