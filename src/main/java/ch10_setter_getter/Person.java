package ch10_setter_getter;

public class Person {
    // 필드 선언
    private String name;
    private int age;
    // 기본 생성자, 매개변수가 하나면 생성자 두 개, 매개변수 두 개인 매개변수 생성자 하나를 작성하시오.


    public Person() {
        System.out.println("기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("이름이 입력되었습니다. 현재 이름 : " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }
/*
    setAge를 자동완성한 것을 기본으로 두고
    나이가 0미만이거나 200초과인 age가 매개변수로 들어오게 된다면,
    객체의 속성에 들어갈 수 없도록 할 것
    PersonMain에서 person1 객체를 '기본생성자로 생성'하고
    person1.setName("김일");
    person1.setAge(243);을 입력했을 때,
    person1.setAge(21)
    콘솔창의 실행 예시로

    실행 예
    기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
    이름이 입력되었습니다. : 김일
    불가능한 나이입력입니다. 현재나이 : 0
    나이가 입력되었습니다.
    변경 전 나이 : 0
    변경 후 나이 : 21

 */
    public void setAge(int age) {
        if(age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다. 현재 나이 : " + this.age);
            return;
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + this.age);
    }

    // 스트링값.length() 하면 스트링 데이터의 길이가 int로 반환됨
    // ex) "안녕하세요".length()의 결과값 : 5

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
