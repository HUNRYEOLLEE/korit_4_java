package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUserName(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("이훈렬");
        System.out.println(user1);


        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUserName(2);
        user2.setPassword(9876);
        user2.setEmail("a@test.com");
        user2.setName("이훈렬");
        System.out.println(user2);
    }
}
