package DAY04;

import java.util.Scanner;

/*
 *
 ***
 *****
 *******
 *********
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");

                } else {System.out.print("*");} //1(1행) 3(2행) 5(3행) 7(4행) 9(5행)
            }
            System.out.println();
        }
    }
}


