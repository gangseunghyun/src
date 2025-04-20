package DAY03;

public class BreakEX {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        /*
        for (num = 0; ;num++){
            sum +=num;
            if (sum >= 100){
                break;
            }
        }

         */
        while (true) {
            sum += num; // sum = sum+num
            if (sum >= 100){
            break;
            }
            num++;
        }
        System.out.println(num);
        System.out.println(sum);}}
        /*
        while (true){
            while (true){
                num++;
                System.out.println("안에 반복문");
                if (num >= 15){
                    break;

                }

            }
            System.out.println("제일 바깥 반복문");
            if (num == 18){
                break;
            }
        }
    }
}
         */
