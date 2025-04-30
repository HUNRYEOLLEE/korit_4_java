package ch16_objects;
/*
    필드를 전부 private으로 선언하시오
    String name;
    String address;

    기본 생성자, 매개변수 생성자(하나짜리 한 개, 두 개짜리 하나) 생성하시오
    ex) 기본 생성자로 객체가 생성되었습니다.
        name 매개변수로 객체가 생성되었습니다.
        name, address 매개변수로 객체가 생성되었습니다. 출력시킬 것

        getter / setter를 정의하시오.

        displayInfo() 메서드를 call1() 유형으로 정의하시오.
        ex)
        이름 :
        주소 :

        ObjectTestMain에서 ObjectTest의 객체를 생성하고 이름에 이름, 주소에 주소를 입력하고 displayInfo()를 호출하시오.

        public ObjectTest(String name) { }
        public ObjectTest(String address) { }
        위의 두 생성자를 작성하면 오류가 발생함
        이유 :
        1. 매개변수와 field는 서로 다른 개념
        두 생성자가 호출되는 상황을 가정하면
        ObjectTest object1 = new ObjectTest("이름");
        ObjectTest object2 = new ObjectTest("주소");
        두 매개변수가 같은 타입이라 구분을 하지 못함


 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        this.name = name;
        System.out.println("name 매개변수로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("name, address 매개변수로 객체가 생성되었습니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("주소 : " + this.address);
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}
