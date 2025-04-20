package DAY06;

// 숫자 배열 ㄹ 자로 만드는 문제

public class Q5_Review {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i * 5 + j + 1;
                    System.out.print(array[i][j] + "\t");

                }
                System.out.println();
            }
            if (i % 2 == 1) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = 10*((i/2)+1) - j; //i=1 -> 10 / i=3 -> 20
                    System.out.print(array[i][j] + "\t");

                }

                System.out.println();
            }

        }
    }
}
