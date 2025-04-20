package DAY03;

public class ForEX {
    public static void main(String[] args) {
        int i;
        int sum;
        //초기화문에 1개 이상을 넣어도 상관없음.
        for (i = 1, sum = 0;i<=10;i++){
            sum += i;
        }
        System.out.println(i+","+sum); //i,sum은 for문 밖에서 사용 가능
//        for (int j = 0;j<=10;j++){ //for문에 초기화 된 변수 for문 안에서만 사용이 가능함.
    }
        //System.out.println(j); ->에러임. j변수가 for문 안에 있기 때문에 밖에서 프린트하면 에러임.
}       //답이 11이 나오는것은 11이 될때 false 기 때문에
