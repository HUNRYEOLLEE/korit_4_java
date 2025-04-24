package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method를 정의하는 영역

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1(){
        System.out.println("[ x | x ]");
//        System.out.println("call1() 타입의 method가 호출되었습니다.");
//        System.out.println("수정되었습니다.");
    }

    // 2. [ o | x ]
    public static void call2(String strExample){
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    // 3. [ x | o ]
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";     // 지역 변수 - 메서드 내에 정의된 변수
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i + 1; j ++) {
                result += "🎁";
            }
            result += "\n"; // \n - 개행하라는 의미    \t - 공백 두번 / 네번
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int date, String day) {
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + date + "일 " + day + "입니다. 😊힘내요";
    }

    // 자기 소개를 하는 메서드를 하나 정의합니다.
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다.\n내년에는 " + (age + 1) + "살 입니다.";
    }

    public static String introduce2(String name, int age) {
        return "제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다.\n내년에는 " + (age + 1) + "살 입니다.";
    }

    public static void main(String[] args) {
        // method를 실행(호출)하는 영역
        call1();
        call2("메서드 이해하기");  // 호출 단계에서 () 내를 채우는 것을 argument
        call3();    // 이 부분은 실행이 안됨
        System.out.println(call3());    // call3()는 출력하라는 명령문이 메서드 내에 정의되어있지 않음
                                        // 이상을 이유로 sout이 main 단계에서 요구됨.
        System.out.println(call4(2025, 04, 24, "목요일"));
        System.out.println(introduce("이훈렬", 25));

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.print("이름을 입력하세요. >>> ");
        name = scanner.next();
        System.out.print("나이를 입력하세요. >>> ");
        age = scanner.nextInt();
        String introduction = introduce2(name, age);
        System.out.println(introduction);

        /*
            함수형 프로그래밍(Functional Programming) :
                메서드1의 리턴값이 메서드2의 argment가 되고, 메서드2의
                return값이 메서드3의 argument가 되는 형식으로,

                첫 번째 메서드로 부터 마지막 메서드까지의 흐름을 통해
                프로그램이 이어지는 방식을 의미함

            이상의 예시에서는 .nextLine()의 결과값과 .nextInt()의 결과값이
            .introduce2()의 argument1, argument2로 사용되었습니다.
         */

    }
}

