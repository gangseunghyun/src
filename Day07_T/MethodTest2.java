package Day07_T;

public class MethodTest2 {

    static int a =1;

    //1.메인문에 있는 값을 메소드 안에 있는 매개변수가 받고 리턴으로 나한테 주고
    static String printHello(String name){
        return  "안녕하세요. "+name+"입니다.";
    }
    

    //2. 메인에서 아무런 값을 주지 않고 메소드 안의 리턴값을 나한테 주고
    static int sum(){
        int a = 20;
        int b = 20;
        return a + b;
    }
    
    //3. 메인문 안의 값을 메소드 안의 매개변수에 넣고 메소드 안의 코드만 실행한다. 
    static void outputName(String name) {
        System.out.println("안녕하세요. " + name + "님");
    }
        
    //4. 메인에서 값을 주지않고 메소드 또한 값을 주지않고,안의 코드만 실행한다.
    static void printBye(){
        
        System.out.println("바이!!!");
    }

/// ////////////////////////////
    public static void main(String[] args) {
        System.out.println(printHello("강승현"));           //1

        System.out.println(sum());                               //2

        outputName("강승현");                                     //3

        printBye();                                              //4







//
//        String str = printHello("홍길동"); // 1
//        System.out.println(str);
//
//        int hap = sum(); // 2
//        System.out.println(hap);
//
//        outputName("호랑이"); // 3
//        System.out.println(printHello("안녕"));
//
//        printBye(); // 4
//        System.out.println(a);
    }
}
