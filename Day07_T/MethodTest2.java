package Day07_T;

public class MethodTest2 {

    static int a;

    //1.주고 받고
    static String printHello(String name){
        a = 10;
        return  "안녕하세요"+name+"님";
    }
    //2. 주고 안받고
    static int sum(){
        int a = 20;
        int b = 20;
        return a + b;
    }
    //3. 안주고 받고
    static void outputName(String name){
        System.out.println("안녕하세요"+name+"님");
    }
    //4. 안주고 안받고
    static void printBye(){
        a = 30;
        System.out.println("바이!!!");
    }


    public static void main(String[] args) {
        String str = printHello("홍길동"); // 1
        System.out.println(str);

        int hap = sum(); // 2
        System.out.println(hap);

        outputName("호랑이"); // 3
        System.out.println(printHello("안녕"));

        printBye(); // 4
        System.out.println(a);
    }
}
