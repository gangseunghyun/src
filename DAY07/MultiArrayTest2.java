package DAY07;

public class MultiArrayTest2 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        a[3] = new int[5];
        System.out.println(a[3][2]);

        int[][][][][] c = new int[4][4][4][][];

        c[0][0][0][0][0] = 101; // 런타임에러 4,5차원에 숫자를 안넣었었기때문에

        c[1][1][1] = a;
       }
}









