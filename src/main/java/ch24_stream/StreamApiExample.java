package ch24_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "최칠");

        // filter()
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();  // to뭐시기 메서드가 실행되었다는 말은, 걔 이전의 자료형이 절대 List가 아니라는 뜻

        // 사실 filter는 그 자체로 한 방에 쓰이기 보다는 합쳐서 씀
        // filter / map / sorted / collect
        List<String> englishNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy", "family");
        List<String> result = englishNames.stream()
                // .여기 사이에 다양한 메서드를 쓰라는 의미
                .filter(name -> name.startsWith("a"))       // a로 시작하는 element만 추출
                .map(String::toUpperCase)                           // 위의 결과값으로 a로 시작하는 것을 뽑았는데, 대문자로 변환
                .sorted()                                               // 정렬
                .toList();

        System.out.println(englishNames);
        System.out.println(result);

        int count1 = englishNames.size();
        System.out.println(count1);

        Long count2 = englishNames.stream().filter(name -> name.length() > 3).count();
        System.out.println(count2);

        // 일반 for문을 구현
        int count3 = 0;
        for(int i = 0; i < englishNames.size(); i++) {
            if(englishNames.get(i).length() > 3) {
                count3++;
            }
        }
        System.out.println(count3);


        System.out.println(names);
        System.out.println(namesWithKim);
    }
}
