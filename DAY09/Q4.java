package DAY09;
/*
연필,지우개, 펜
연필은 각각의 빨강,파랑,주황,노랑
연필은 쓰는 기능(츨력)
ex) 빨간색 연필로 적습니다. (출력)

지우개는 각각 잠자리, 모닝글로리의 제조사
지우개는 지우는기능 (출력)
ex)지우개는 잠자리의 제품으로 지웁니다(출력)

펜은 검정-모나미 / 초록-제트스트림 / 베이비블루 -워터맨
펜은 쓰는 기능(출력)
ex) 펜은 모나미 제품의 검정색으로 씁니다.(출력)

먼저 4개의 연필을 쓰고 그 다음 2개의 지우개로 지우고
마지막으로 3개의 팬을 쓰는 프로그램을 만드세요
 */

class Pencil{
    String pencilColor;
    void pencilFunction(){
        System.out.println(pencilColor+"의 색깔로 적습니다.");
    }
}

class Eraser{
    String eraserMade;
    void eraserFunction(){
        System.out.println("지우개는 "+eraserMade+"의 제품으로 지웁니다.");
    }
}

class Pen{
    String penMade;
    String penColor;
    void penFunction(){
        System.out.println("펜은"+penMade+"의 제품의 "+penColor+"으로 씁니다.");
    }
}

public class Q4 {
    public static void main(String[] args) {

        //연필
        Pencil [] pencil = new Pencil[4];
        String [] color = {"빨간색","파란색","주황색","노랑색"};
        for (int i = 0;i< pencil.length;i++){
            pencil[i]=new Pencil();
            pencil[i].pencilColor =color[i];
            pencil[i].pencilFunction();
        }

        //지우개

        Eraser eraser1 = new Eraser();
        eraser1.eraserMade = "잠자리";
        eraser1.eraserFunction();

        Eraser eraser2 = new Eraser();
        eraser2.eraserMade = "모닝글로리";
        eraser2.eraserFunction();

        //펜  펜은 검정-모나미 / 초록-제트스트림 / 베이비블루 -워터맨

        Pen pen1 = new Pen();
        pen1.penMade = "모나미";
        pen1.penColor = "검정색";
        pen1.penFunction();

        Pen pen2 = new Pen();
        pen2.penMade = "제트스트림";
        pen2.penColor = "초록색";
        pen2.penFunction();

        Pen pen3 = new Pen();
        pen3.penMade = "워터맨";
        pen3.penColor = "베이비블루";
        pen3.penFunction();


    }
}
