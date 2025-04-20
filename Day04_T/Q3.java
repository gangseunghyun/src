package Day04_T;

public class Q3 {
    public static void main(String[] args) {
        // "*", " "
        //1.
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0;i<5;i++){ //행
            for(int j = 0;j<5;j++){ // 열
                System.out.print("*");
            }
            System.out.println();
        }
        //2.
        //*
        //**
        //***
        //****
        //*****
        /*
        for(int i = 0;i<=0;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=1;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=2;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=3;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=4;i++){
            System.out.println("*");
        }
        */
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //3.
        //     * 4 3 2 1 *
        //    ** 4 3 2 * *
        //   *** 4 3 * * *
        //  **** 4 * * * *
        // ***** * * * * *
        for(int i = 0;i<5;i++){
            for(int j = 4; j >= 0; j--){ // 4 3 2 1 0 / 4 3 2 1 0
                if(i < j){ // 0 < 4 0 < 3 0 < 2 0 < 1 0 < 0
                           // 1 < 4 1 < 3 1 < 2 1 < 1 1 < 0
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 0;i<5;i++){
            // 4 3 2 1 0
            // for(int j = 0; j<4 - i; j++)
            for(int j = 4; j >= 0; j--){ // 4 3 2 1 0 / 4 3 2 1 0
                if(i < j){ // 0 < 4 0 < 3 0 < 2 0 < 1 0 < 0
                    // 1 < 4 1 < 3 1 < 2 1 < 1 1 < 0
                    System.out.print(" ");
                }
                else{
                    for(int k =0;k<= i * 2;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                    //     0       012     01234     0123456  012345678
                    //System.out.print("*"); // 1(0*2-1) 3(1*2-1) 5(2*2-1) 7(3*2-1) 9(4*2-1)
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<5;i++){
            for(int j = 0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<= i * 2;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0;i<3;i++){
            for(int j = 0;j<2-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<= i * 2;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            // 3 - (i * 2)= 3 // 3 - (i * 2) = 1
            for(int k = 3; k - (i * 2)>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
