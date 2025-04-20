package Day01;

public class PrintTest {
    public static void main(String[] args) {
        System.out.print("안녕");
        System.out.print("Hello");
        System.out.println(); // 줄바꿈
        System.out.println("잘가");
        System.out.print("Bye");
        System.out.println(541121);
        System.out.println(1.4234);
        /*
            안녕Hello
            잘가
            Bye541121
            1.4234
         */
        // \n 개행 줄바꿈
        System.out.printf("나는 %s입니다.\n","홍길동");//나는 홍길동입니다.
        System.out.printf("%d + %d = %d\n",5,5,10);
        System.out.printf("%f + %f = %f\n",2.7,3.1,2.7+3.1);
    }
}
