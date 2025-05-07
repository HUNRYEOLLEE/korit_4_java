package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();     // 아까와 다르게 그냥 Gson 인스턴스를 생성
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 아까와 동일하게 gsonBuilder를 통해서 prettyPrinting이 적용될 수 있도록 인스턴스 생성

        // 사용할 변수 선언
        String userJson = null;

        // 1. Java Object -> json으로 변환
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 바꿔보자
        userJson = gson.toJson(user1);
        System.out.println("gson 사용 결과값 : " + userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("gsonBuilder 사용 결과값 : " + userJson);


        // 2. JsonObject -> json 변환
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "2025001");
        jsonObject1.addProperty("studentName", "김이");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson;
        studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용 결과값 : " + studentJson);
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println("gsonObject 사용 결과값 : " + studentJson);

        // 3. Map -> Json 데이터로 변환
        /*
            Map을 활용하여 key String / value String으로 선언하고,
            객체명을 map1으로 한 번 map을 실행하시오.

            map에 productCode NT960XHA-K072G
            productName 삼성 갤럭시북 프로 5
            라는 Entry(key-value pair)를 입력하시오.

            gson 및 gsonbuilder를 활용하여 json 데이터로 바꿀 것임.
         */
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-K072G");
        map1.put("productName", "삼성 갤럭시북 프로 5");
        System.out.println("gson  사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder  사용 사례 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        // json -> Map 자료형으로 바꾸려면 어떻게 해야 할까?
        // 즉 json 데이터를 user 객체로 다시 바꾸는 것과
        // json 데이터를 map2 형태로 작성하는 것을 의미함.
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        // gsonBuilder.toJson(map1)이던 gson.toJson(map1)이던 상관없음
        System.out.println(map2);

        // json -> User 클래스의 인스턴스로 바꾸는 방법

        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject : 이게 의미하는 바는 json 데이터 =/= jsonObject 이다.
        // studentJson의 자료형은 String 이고, jsonObject1의 자료형은 JsonObject이다.
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
