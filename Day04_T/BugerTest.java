package Day04_T;

import java.util.Scanner;

/*
메인메뉴 -> 숫자
1. 갈릭버거 2.페페로니 3.페포로니치킨 4.콜로수워치킨 5.종료
사이드메뉴 -> 숫자
1. 감자튀김 2.콜라 3.사이다
결제 -> 문자열 입력
카드, 상품권, 현금
출력
주메뉴 : 갈릭버거 사이드 메뉴 : 감자튀김 결제 방법 : 카드
이 순서로 하다가 만약에 없는 번호를 입력 하거나 잘 못된 문자열이 입력되면 그에 맞게
출력
1. 잘못된 메인메뉴 입력입니다.
2. 잘못된 사이드메뉴 입력입니다.
3. 결제 수단이 잘 못 됐습니다.

주메뉴에서 5번 종료가 있기 전까지는 무한반복
 */
public class BugerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu; // 주메뉴
        String sideMenu; //사이드메뉴
        String pay; //결제 수단
        boolean check = true;
        while(check){
            System.out.print("<메뉴를 입력하세요> 1. 갈릭버거 2.페페로니 3.페포로니치킨 4.콜로수워치킨 5.종료 : ");
            int mNum = sc.nextInt();
            int sNum;
            switch (mNum){
                case 1:
                    menu = "갈릭버거";
                    System.out.println("<사이드 메뉴를 입력하세요> 1.감자튀김 2.콜라 3.사이다 :");
                    sNum = sc.nextInt();
                    switch (sNum){
                        case 1:
                            sideMenu = "감자튀김";
                            System.out.print("결제 방법을 입력 하세요 : ");
                             pay = sc.next();
                             if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                 System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                             }
                             else{
                                 System.out.println("결제수단이 잘 못 됐습니다.");
                             }
                            break;
                        case 2:
                            sideMenu = "콜라";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 3:
                            sideMenu = "사이다";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 사이드메뉴 입력입니다.");
                            break;
                    }
                    break;
                case 2:
                    menu = "페페로니";
                    System.out.println("<사이드 메뉴를 입력하세요> 1.감자튀김 2.콜라 3.사이다 :");
                    sNum = sc.nextInt();
                    switch (sNum){
                        case 1:
                            sideMenu = "감자튀김";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 2:
                            sideMenu = "콜라";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 3:
                            sideMenu = "사이다";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 사이드메뉴 입력입니다.");
                            break;
                    }
                    break;
                case 3:
                    menu = "페포로니치킨";
                    System.out.println("<사이드 메뉴를 입력하세요> 1.감자튀김 2.콜라 3.사이다 :");
                    sNum = sc.nextInt();
                    switch (sNum){
                        case 1:
                            sideMenu = "감자튀김";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 2:
                            sideMenu = "콜라";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 3:
                            sideMenu = "사이다";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 사이드메뉴 입력입니다.");
                            break;
                    }
                    break;
                case 4:
                    menu = "콜로수워치킨";
                    System.out.println("<사이드 메뉴를 입력하세요> 1.감자튀김 2.콜라 3.사이다 :");
                    sNum = sc.nextInt();
                    switch (sNum){
                        case 1:
                            sideMenu = "감자튀김";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 2:
                            sideMenu = "콜라";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        case 3:
                            sideMenu = "사이다";
                            System.out.print("결제 방법을 입력 하세요 : ");
                            pay = sc.next();
                            if(pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")){
                                System.out.println("주메뉴 : "+menu+" 사이드 메뉴 : "+sideMenu +"결제 방법 : "+pay);
                            }
                            else{
                                System.out.println("결제수단이 잘 못 됐습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 사이드메뉴 입력입니다.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 메인메뉴 입력입니다.");
                    break;
            }
        }
    }
}
