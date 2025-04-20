package TaeHyun;

public class While {
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;

        /*
        num이 증가해야하고
        sum = sum+num
        sum이 100이상일때 멈춤
        while은 어떠한 조건이 될때까지 반복


         */
/*
        while(sum <=100){
            if (num>=0){
            sum += num;
            num++;
                    }

    }

 */

        while (true) {
            sum += num;
            if (sum >= 100) {
                break;
            }
            num++;
        }
        System.out.println(sum);
        System.out.println(num);

        while (true) {
            System.out.println("제일 바깥 반복문");
            if (num >= 18) {
                break;
            }
            while (true) {
                num++;
                System.out.println("안에 반복문");
                if (num >= 15) {
                    break;
                }
            }




        }
    }
}