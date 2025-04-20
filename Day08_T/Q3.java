package Day08_T;

import java.util.Random;

public class Q3 {

    static int randomMake(){
        Random r = new Random();
        return r.nextInt(26);
    }
    static int add(int ran){
        return 65 + ran;
    }

    static char makeChar(int result){
        return (char)result;
    }
    static void mainRun(){
        String result = "";
        for(int i = 0;i<10;i++){
            /*
            int ran = randomMake();
            int val = add(ran);
            char ch = makeChar(val);
            result += makeString(ch);
             */
            result += makeString(makeChar(add(randomMake())));
        }
        printString(result);
    }
    static String makeString(char ch){
        return ""+ch;
    }
    static void printString(String result){
        System.out.println(result);
    }

    public static void main(String[] args) {
        mainRun();
    }
}
