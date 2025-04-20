package DAY04;

/*
1. 원하는 구구단 출력
2. 전체 구구단 출력
3. 종료

<첫화면>
1번 입력시
원하는 구구단 : 5 -> 5단 출력
2번 입력시 -> 전체 구구단 출력
3번 입력시 -> 프로그램 종료

단 1,2번 실행 완료시 첫화면으로 이동
-1 첫화면 1-3 이외 숫자 입력 시  "잘못된 입력입니다."
두번째 화면 2-9 이외 숫자 입력시 "잘못된 입력입니다."
잘못된 입력 발생시 첫화면으로 이동

while문 사용해서 프로그램 종료 이외는 무한 반복
switch로 숫자 적용 switch로 1-3번 입력시 -> 그 안에서 다시 switch
 */


import java.util.Scanner;

public class Q2_WhileSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean out = true;
        while (out){
            System.out.print("1. 원하는 구구단 출력 2. 전체 구구단 출력 3. 종료  \n숫자 입력 : ");
            num = sc.nextInt();

            int gugu;
            int wgugu;

            switch (num){

                case 1:  // 첫화면 원하는 구구단
                    System.out.print("원하는 구구단 : ");
                    gugu = sc.nextInt();
                    switch (gugu){ // 원하는 구구단 시작

                        case 2:
                            int dan =2;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;

                        case 3:
                            dan =3;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;

                        case 4:
                            dan =4;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }

                            break;
                        case 5:
                            dan =5;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;
                        case 6:
                            dan =6;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;
                        case 7:
                            dan =7;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;
                        case 8:
                            dan =8;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;
                        case 9:
                            dan =9;
                            for (int times = 1; times <=9; times++){
                                System.out.println(dan + "*" + times + "="+(dan*times));
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");

                            break;

                    }
                    break;
                case 2: // 두번째 화면 전체 구구단
                    for(int dan = 2;dan<=9;dan++) {
                        System.out.println(dan + "단");
                        for (int times = 1; times <= 9; times++) {
                            System.out.println(dan + "*" + times + "=" + dan * times);
                        }
                    }
                    break;
                case 3: // 종료
                    System.out.print("프로그램을 종료합니다");
                    out = false;
                    break;
                default: // 잘못된 입력
                    System.out.println("잘못된 입력입니다.");
                    break;

            }

        }


    }
}
