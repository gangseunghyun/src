package DAY07;

/*
1. 배열
 */

public class Q2_Array {
    public static void main(String[] args) {

        int [][] array = new int[5][5];
        int count=1;

        //행과 열

        int i = 0;
        int j;
        for (j = 0 ; j < array[0].length-1;j++){  //i=0
            array[i][j] = count++;

        }


        j = 4;                                   //j=4
        for (i = 0; i < array.length;i++){
            array[i][j] = count++;

        }
        i= 4;                                   //i=4
        for (j=array[0].length-2;j>=0;j--){
            array[i][j] = count++;
        }

        j=0;                                    //j=0
        for (i=array.length-2;i>0;i--){
            array[i][j] = count++;
        }

        i=1;                                    //i=1
        for (j=1;j<array[i].length-1;j++){
            array[i][j] = count++;
        }

        j=3;                                    //j=3
        for (i=2;i<array.length-1;i++){
            array[i][j] = count++;
        }
        i=3;                                    //i=3
        for (j=array[i].length-3;j>0;j--){
            array[i][j] = count++;
        }
        i=2;                                    //i=2
        for (j=1;j<3;j++){
            array[i][j] = count++;
        }

        //출력
        for (i=0;i< array.length;i++){
            for (j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
