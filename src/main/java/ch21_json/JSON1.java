package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        // 속성(key - value entry)을 추가하는 메서드 -> addProperty() 사용
        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");

        System.out.println(jsonObject1);
        /*
             {"username":1,"password":1234,"email":"a@test.com","name":"김일"}
             위의 콘솔창에서의 결과값을 Java Map과 비교해보자면
             1. Map 에는 key 부분에 ""가 없고,
             JSON 에서는 모든 key가 String 자료형 처럼 보이도록 ""가 있다.

             2. Map 에서는 key1=value1의 형태로 작성되어있었지만
             JSON 에서는 "key1":value1의 형태로 작성되어있다
         */

        jsonObject1.addProperty("job", "학생");
        System.out.println(jsonObject1);
        /*
             콘솔에 출력된 값을 확인해보면 한 줄로 길게 늘어져있다.
             addProperty()를 통해 키-값 쌍을 늘릴수록 계속 길어져서 가독성을 해치게 될 것으로 보인다.
             가독성을 높이기 위해서 key:value 마다 개행이 이루어 지면 좋을 것 같은데 이때 사용할 수 있는 Gson 관련 클래스들을 아래에서
             사용할 것이다.
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // method chaining
        String json = gson.toJson(jsonObject1);
        System.out.println(json);
        /*
            출력)
            {
              "username": 1,
              "password": 1234,
              "email": "a@test.com",
              "name": "김일",
              "job": "학생"
            }
         */
    }
}
