package Day07_T;

public class MultiArrayTest2 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        a[3] = new int[5]; // 문제 없죠
        System.out.println(a[3][2]); // ? 0

        int[][][][][] c = new int[4][4][4][][];

        c[0][0][0][0][0] = 101; // ? 에러 런타임 에러

        c[1][1][1] = a;

    }
}
