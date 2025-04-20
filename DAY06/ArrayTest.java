package DAY06;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array = new int[10];
        // 총 갯수 : 10개인데 0~9까지있음 방은 10개  인덱스는 array.length-1
        System.out.println(array.length);

        for (int i = 0; i<array.length; i++){
            array[i] = i +1;
        }
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }


        int[][][] d = new int [3][2][1];
        int [] a = {1,2,3};
        System.out.println(a[1]);
    }

}
