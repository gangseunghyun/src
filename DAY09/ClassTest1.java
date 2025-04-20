package DAY09;
class A{
    int a; // 변수(속성)
    int b;
    void  print(){ //메소드(기능)
        System.out.println("a는 "+a+"입니다.");
        System.out.println("a는 "+b+"입니다.");
    }
}
public class ClassTest1 {
    public static void main(String[] args) {
        A abc = new A(); //객체 생성  여기서 A는 참조자료형
        abc.a = 20;
        abc.b = 10;
        abc.print();

        A b = new A();
        b.print();
    }

}
