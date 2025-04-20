package DAY06;

public class Q5_2 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;
//        int sw = 1; //스위치
        boolean toggle = true;
        for (int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(toggle){
                    a[i][j] = count++;
                }
                else{
                   a[i][a[i].length-j-1] = count++;
                }
            }
//            sw = sw * -1;
            toggle = !toggle;
        }

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
