package Day06_T;

public class Q5_1 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;

        for(int i = 0;i<a.length;i++){ // 행
            //열
            //짝수
            if(i % 2 == 0){
                for(int j = 0;j<a[i].length;j++){ // 0 1 2 3 4
                    a[i][j] = count++;
                }
            }
            else{
                for (int j = a[i].length-1;j>=0;j--){ //4 3 2 1 0
                    a[i][j] = count++;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
