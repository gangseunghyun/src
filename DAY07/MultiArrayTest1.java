package DAY07;

public class MultiArrayTest1 {
    public static void main(String[] args) {
        int [][] d = new int [3][];
        d[0] = new int[5]; // 각각의 행마다 다른 숫자를 줄 수 있음
        d[1] = new int[2];
        d[2] = new int[3];


        int count = 1;
        for (int i = 0 ; i<d.length;i++){
            for (int j = 0; j<d[i].length; j++){
                d[i][j] = count++; // 배열에 값 대입
            }

        }

        for ( int i = 0 ; i<d.length;i++){
            for (int j = 0 ; j<d[i].length;j++){
                System.out.print(d[i][j]+"\t"); // 값 출력
            }
            System.out.println(); //d[i]의 배열길이가 끝나면 개행
        }

    }
}
