package Day02;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9f;

        int iNum3 = (int) dNum1 + (int) fNum2; // 1 + 0 = 1
        int iNum4 = (int) (dNum1 + fNum2); // 1.2 + 0.9 = 2.1 -> 2
        System.out.println(iNum3);
        System.out.println(iNum4);





    }





}
