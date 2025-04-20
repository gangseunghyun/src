package Day03_T;

public class BreakEX {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        /*
        for(num = 0; ;num++){
            sum += num;
            if(sum >= 100){
                break;
            }
        }
         */
        while (true){
            sum += num;
            if(sum >= 100){
                break;
            }
            num++;
        }
        System.out.println(num);
        System.out.println(sum);
        while(true){
            System.out.println("제일 바깥 반복문");
            if(num == 18){
                break;
            }
            while(true){
                num++;
                System.out.println("안에 반복문");
                if(num >= 15){
                    break;
                }
            }
        }
    }
}
