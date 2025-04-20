package DAY03_T;

public class xo4 {
    public static void main(String[] args) {
        int [][] ar = new int [5][5];
        int count =1;

//        for (int i=0; i<5; i++){
//            if(count/5%2==0){
//                for(int j=0; j<5; j++){
//                    ar[i][j]=count;
//                    count++;
//                }
//            }else{
//                for(int j=4; j>=0; j--){
//                    ar[i][j]=count;
//                    count++;
//                }
//            }
//        }
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.print(ar[i][j]);
//            }
//            System.out.println();
//        }


        for(int i=0; i<ar.length; i++){
            if(i%2==0){
                for(int j=0; j<ar[i].length;j++){
                    ar[i][j] = i*5 +j+1;
                }
            }else{
                for(int j=0; j<ar[i].length;j++){
                    ar[i][j]=(i+1)*5-j;
                }
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
