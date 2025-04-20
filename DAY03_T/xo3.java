package DAY03_T;

import java.util.Scanner;

public class xo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean toggle = true;
        while (toggle){
            System.out.println("항목을 선택 해 주세요");
            System.out.print("1. 직사각형\t");
            System.out.print("2. 정직삼각형\t");
            System.out.print("3. 역직삼각형\t");
            System.out.print("4. 피라미드각형\t");
            System.out.print("5. 다이아몬드각형\t");
            System.out.println("6. 나가기");
            int select = sc.nextInt();
            System.out.println("줄 갯수");
            int rowsize = sc.nextInt();
            if(select==6){
                System.out.println("나가기를 선택했습니다.");
                toggle=false;
            }else if (select==1){//직사각형
                for(int i=0; i<rowsize; i++){//row
                    for(int j =0; j<rowsize; j++){//col
                        System.out.print("*");

                    }
                    System.out.println();
                }
            }else if(select==2){//정직삼각형
                for(int i=0; i<rowsize; i++){
                    for(int j=0; j<=i ;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }else if(select==3){//역직삼각형
                for(int i=0; i<rowsize; i++){
                    for(int j=0; j<rowsize-i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }else if(select==4){//피라미드 각형
                for(int i=0; i<rowsize; i++){
                    for(int j=0; j<rowsize-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=0; j<i*2+1;j++){
                        System.out.print("*");
                    }
                    for(int j=0; j<rowsize-i;j++){
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
            }else if(select==5){//마름모
                for(int i=0; i<rowsize/2; i++){// 위삼각형만들기
                    for(int j=0; j<rowsize/2-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=0; j<i*2+1;j++){
                        System.out.print("*");
                    }
                    for(int j=0; j<rowsize/2-i;j++){
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
                for(int i=rowsize/2; i>=0; i--){// 위삼각형만들기
                    for(int j=0; j<rowsize/2-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=0; j<i*2+1;j++){
                        System.out.print("*");
                    }
                    for(int j=0; j<rowsize/2-i;j++){
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
            }
/*10
* 5
* 456
* 34567
* 2345678
* 12346789
*
* */
        }
    }
}
