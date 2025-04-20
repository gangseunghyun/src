package DAY03_T;

import java.util.Scanner;

/*
*
* 모험가의 보스 몬스터잡기
*
* 당신은 모험가 입니다. 보스몬스터를 무찔러주세요
*
* 보스(bossHp)의 체력은 100입니다.
* 여러 공격을 이용하여 보스를 무찔러주세요
* 1. 찌르기 - 데미지 10
* 2. 베기 - 데미지 5
* 3. 간지럽히기 - 데미지 1
* 4. 도망가기
*
* 보스의 체력이 바닥이 나면 " 보스를 무찔렀습니다" 문구 출력

찌르기 시전시 : "찌르기를 하였습니다." 문구 출력
베기 시전시 : "베기를 하였습니다." 문구 출력
간지럽히기 시전시 : "간지럽히기를 하였습니다."


도망가기 시전시 : "도망가였습니다 ㅠㅠ" 문구출력
	!!도망가기 시전하였을 때 "보스를 무찔렀습니다" 출력X

*
*
* 1. BOSS체력 변수 생성
* 2. 반복문 설정 : 보스 체력이 바닥날때 까지
* 3. 공격 입력받기
* 4. 입력받은 공격에 따라서 보스의 체력 깎기
*
* 5. 보스 체력이 바닥나면 무찔렀다는 문구생성
* 6. 도망갔다면 도망갔따는 문구 생성
*
*
* */
public class xo2 {
    public static void main(String[] args) {
        int bosshp = 100;   //보스체력 초기값
        Scanner sc = new Scanner(System.in);
        int attack = 0;     // 입력받는 변수
        while(bosshp>0){
            System.out.println("현재 보스 체력 : "+bosshp);
            System.out.println("1.찌르기, 2.베기, 3.간지럽히기, 4.도망가기");
            System.out.print("공격을 선택 해주세요 : ");
            attack = sc.nextInt();  //공격 입력받기(보스체력이 바닥날떄까지 공격 계속 받음)
            if(attack==1){
                bosshp =bosshp - 10;        //찌르기 시 보스체력 -10
                System.out.println("찌르기를 하였습니다.");
            }else if(attack==2){
                bosshp =bosshp - 5;         //베기 시 보스체력 -5
                System.out.println("베기를 하였습니다.");
            }else if(attack==3){
                bosshp =bosshp - 1;         // 간지럽히기시 보스체력 -1
                System.out.println("간지럽히기를 하였습니다.");
            }else if(attack==4){            //도망갔을 때 반복문 종료
                System.out.println("도망가였습니다 ㅠㅠ");
                break;
            }
            System.out.println("-----------------------");
            System.out.println("");
        }
        if(attack!=4){      //보스가 죽었을때 나오는 문구(도망가기 했을땐 안나옴)
            System.out.println("현재 보스 체력 : 0");
            System.out.println("보스를 무찔렀습니다!! 축하해용!");
        }


    }
}
