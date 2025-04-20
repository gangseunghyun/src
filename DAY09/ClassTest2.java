package DAY09;

class Student{
    int studentID;
    String studentName;
    int grade;
    String address;
    void showStudentInfo(){
        System.out.println(studentName+","+address);
    }
}

public class ClassTest2 {
    public static void main(String[] args) {
      //참조자료형 변수명     new + 생성자
        Student student1 = new Student();

        student1.studentName = "홍길동";
        student1.address = "부평구";
        student1.showStudentInfo();

        Student student2 = new Student();
        student2.studentName = "김길동";
        student2.address = "미추홀구";
        student2.showStudentInfo();
    }

}
