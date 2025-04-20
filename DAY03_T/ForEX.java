package DAY03_T;

public class ForEX {
    public static void main(String[] args) {
        int i;
        int sum;
        //초기화문에 1개이상을 넣어도 상관이 없습니다.
        for(i = 1, sum = 0;i<=10;i++){
            sum += i;
        }
        System.out.println(i+","+sum); //i, sum for문 밖에서 사용 가능

        for(int j = 0;j<=10;j++){ // for문에 초기화 된 변수 for문 안에서만 사용이 가능함
            //System.out.println(j); 에러 j변수가 없음

        }
    }
}
