package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData1
                = new ResponseData<>("날짜 저장 성공 : ", now.toString());
        // <T>에서 T가 클래스이기 때문에 기본자료형이 들어가지 못한다. 즉 Int가 아니라 Integer이여야 한다.
        ResponseData<Integer> responseData2
                = new ResponseData<>("나이 저장 성공 : ", 38);
        ResponseData<Date> responseData3
                = new ResponseData<>("날씨 객체 저장 성공 : ", now);

        System.out.println(responseData1);      // ResponseData 클래스에 @Data가 있으니까 toString()이 있다고 볼 수 있다.
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
