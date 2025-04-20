package DAY03;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 띄어쓰기해도 다나옴
        String str1 = sc.next(); // 띄어쓰기하면 앞에것만 나옴

        System.out.println(str);
        System.out.println(str1);
    }
}
