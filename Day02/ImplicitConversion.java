package Day02;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // int 로 자동형변환 이루어짐

        int iNum2 = 20;;
        float fNum = iNum2; // float로 자동 형변환 이루어짐

        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; // float + int -> 실수 float로 자동형변환 됨
        System.out.println(dNum);
    }
}
