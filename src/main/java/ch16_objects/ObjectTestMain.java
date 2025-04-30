package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();
        objectTest.setName("이훈렬");
        objectTest.setAddress("부산 부산진구");
//        objectTest.displayInfo();
        System.out.println(objectTest);

        Teacher teacher = new Teacher("홍길동", "뭐시기고등학교");
        System.out.println(teacher);
    }
}
