package TaeHyun;

import java.util.Scanner;
/*
모험가의 보스 몬스터잡기
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
*/

public class Q3 {
    public static void main(String[] args) {

        int bossHP = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 보스 체력 : " + 100);
        System.out.println("1.찌르기 2.베기 3.간지럽히기 4.도망가기");
        System.out.print("공격을 선택 해주세요 : ");
        int option = sc.nextInt();



        int option1d = 10;
        int option2d = 5;
        int option3d = 1;




            boolean out = true;

            while (bossHP > 0 && out) {


                switch (option) {

                    case 1:
                        System.out.println("찌르기를 하였습니다.");
                        System.out.println("--------------------");
                        System.out.println("현재 보스 체력 : " + (bossHP -= option1d));
                        if (bossHP>0){
                        System.out.println("1.찌르기 2.베기 3.간지럽히기 4.도망가기");
                        System.out.print("공격을 선택 해주세요 : ");
                        option = sc.nextInt();}
                        else System.out.println("보스를 무찔렀습니다.");


                        break;

                    case 2:
                        System.out.println("베기를 하였습니다.");
                        System.out.println("--------------------");
                        System.out.println("현재 보스 체력 : " + (bossHP -= option2d));
                        if (bossHP>0){
                        System.out.println("1.찌르기 2.베기 3.간지럽히기 4.도망가기");
                        System.out.print("공격을 선택 해주세요 : ");
                        option = sc.nextInt();}
                        else System.out.println("보스를 무찔렀습니다.");

                        break;

                    case 3:
                        System.out.println("간지럽히기를 하였습니다.");
                        System.out.println("--------------------");
                        System.out.println("현재 보스 체력 : " + (bossHP -= option3d));
                        if (bossHP>0){
                        System.out.println("1.찌르기 2.베기 3.간지럽히기 4.도망가기");
                        System.out.print("공격을 선택 해주세요 : ");
                        option = sc.nextInt();
                        }
                        else System.out.println("보스를 무찔렀습니다.");

                        break;

                    case 4:
                        System.out.println("도망가였습니다ㅠㅠ");
                        out = false;
                        break;


                    default:
                        System.out.println("잘못 입력하였습니다.");
                        out = false;
                        break;


                }


            }

        }}




        /*
        } else if (option.equals(option1)) {
            System.out.println("찌르기를 하였습니다.");
        } else if (option.equals(option2)) {
            System.out.println("베기를 하였습니다.");
        } else if (option.equals(option3)) {
            System.out.println("간지럽히기를 하였습니다.");
        } else System.out.println("잘못입력하였습니다.");

        if (option.equals(option1)) {
            System.out.println("------------------------");
            System.out.println("현재 보스 체력 : " + (bossHP-option1d));
            System.out.println("1.찌르기 2.베기 3.간지럽히기 4.도망가기");
            System.out.print("공격을 선택 해주세요 : ");
        } else if (bossHP) {

        }*/