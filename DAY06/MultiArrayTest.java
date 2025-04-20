package DAY06;

public class MultiArrayTest {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        // a[0]= 10; 에러인 이유는 자료형이 int []기때문에 int를 받을 수 없다.

        int count = 1;
        for (int i = 0; i<a.length;i++){
            for (int j = 0; j<a[i].length;j++){
                a[i][j] = count++;
            }
        }

        for (int i = 0 ; i<a.length;i++){
            for (int j = 0;j<a[i].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

     }
}
