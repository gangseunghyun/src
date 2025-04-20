package Day02;

public class IfEX1 {
    public static void main(String[] args) {
        int money = 5000;
        int money1 = 6000;
        if (money <= money1){ // 단일 if문
            System.out.println("허리를 숙여서 "+ money1+"원을 줍는다");
        }
        System.out.println("친구 만나러 간다");
        int age = 7;
        if (age >= 8){  // if-else문
            System.out.printf("학교에 다닙니다");
        }
        else {
            System.out.printf("학교에 다니지 않습니다.");
        }


    }
}
