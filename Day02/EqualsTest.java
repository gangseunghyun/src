package Day02;

public class EqualsTest {
    public static void main(String[] args) {
        String str = "hi";
        if (str == "hi"){
            System.out.println("==");
        }
        //아래게 안정적
        if (str.equals("hi")){
            System.out.println("equlas");
        }
    }
}
