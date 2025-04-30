package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스인 person1을 만든다고 가정
        // 원래라면 아래와 같이 작성해야 했음
//        Person person1 = new Person("김일", 21, "서울특별시 종로구");
        // 하지만 AllArgsConstructor가 없다면
        // Person person1 = new Person();
        // person1.setName("김일");
        // person1.setAge(21);
        // person1.setAddress("서울특별시 종로구"); 로 작성해야했다.

        Person person1 = new Person.Builder().name("김일").age(21).address("서울특별시 종로구").build();
        Person person2 = new Person.Builder().age(21).name("김일").build();
        Person person3 = new Person.Builder().build();

    }
}
