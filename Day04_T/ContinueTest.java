package Day04_T;

public class ContinueTest {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("===================================");
        for(int i = 0;i<6;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
