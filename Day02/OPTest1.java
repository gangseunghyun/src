package Day02;

public class OPTest1 {
    public static void main(String[] args) {
        //1. 산술연산자
        int mathScore = 90;
        int engScore = 70;
        int totalScore =mathScore + engScore;
        System.out.println(totalScore);
        double avgScore = totalScore / 2.0; //자동형변환
        System.out.println(avgScore);
        System.out.println(6912394 % 3);  //나머지연산자
        int a = 10;
        System.out.println(a++); //후치
        System.out.println(++a); //전치
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
        System.out.println(5>3 && 4 == 7 || 3 != 7); // true
       //System.out.println(a++ < ++c && d-- != c++ && b-- == d++);
        //4. 단축연산자
        int e = 10;
        int f = 5;
        e += f;  // e= e+f
        System.out.println(e); // 15
        e -= f; // e=e-f
        System.out.println(e); // 10 -> e가 15가 된건가 ㅇㅇ
        //5. 삼항연산자
        int x = e == 10 ? c == 20 ? 5 : f == 5? 9 : 13 : 0;
        System.out.println(x); // 참이면 앞의 조건 거짓이면 뒤의 조건



    }
}
