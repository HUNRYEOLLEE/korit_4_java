package ch09_classes;

public class ClassA {
    int num;
    String name;
    double score;

    public void callName() {
        System.out.println(name + "을 부릅니다.");
    }

    public void displayProfile() {
        System.out.println("[ 실행 결과 ]");
        System.out.println(num + " 학번의 학생의 이름은 " + name + "이고, " + score + "점 입니다.");
    }
}
