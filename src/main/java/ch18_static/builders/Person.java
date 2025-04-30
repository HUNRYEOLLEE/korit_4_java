package ch18_static.builders;

public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        // method 정의
        // method는 대부분 행위를 나타내기 때문에 동사로 작성하지만
        // Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드 명을 사용

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 위의 코드는 Person 클래스의 필드와 관련있는 메서드
        // 이후 객체 생성을 완료하는 메서드를 정의해야함 -> 기본적으로 build()라고 지음
        public Person build() {
            return new Person(this);
        }
    }
}
