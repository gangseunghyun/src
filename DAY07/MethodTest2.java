package DAY07;

import java.util.Scanner;

public class MethodTest2 {
    static int a=40;
    //1. 주고 받고
    static String printHello(String name){
        return  "안녕하세요 "+name+"님";
    }

    //2. 주고 안 받고
    static int sum(){

        int a = 10;
        int b = 20;
        return a+b;
    }
    //3. 안주고 받고
    static void outputName(String name){
        System.out.println("안녕하세요 "+name+"님");
    }
    //4. 안 주고 안 받고
    static void printBye(){
        System.out.println("바이!!!");
    }




    public static void main(String[] args) {

        System.out.println(printHello("정현"));

        int hap = sum(); //2
        System.out.println(hap);

        outputName("호랑이"); //3
        Scanner sc = new Scanner(System.in);
        printBye(); //4
        int num1 = sc.nextInt();
        a = num1;
        System.out.println(a);
    }
}
