package ch20_collections;

import java.util.*;

/*
     List는 순서가 있고 중복을 허용하는 반면에 Set는 순서는 없고, 중복도 허용하지 않는다.
     (수학에서의 집합 개념을 Collection으로 구현한 것이 Set에 해당)
     그래서 특성의 차이로 인해 List -> Set / Set -> List로의 형변환이 매우 중요함.
     List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여 후보군들만 남기는 등의
     응용이 가능하기 때문에, 혹은 Set을 List로 바꿔 .get(인덱스넘버)를 통해 조회를하기 위해
     서로 간의 형변환이 매우 중요하다.
 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet1 = new HashSet<>();
        // 형변환이 중요하다고 했으니 List도 생성
        List<String> strList1 = new ArrayList<>();

        // Set에 element 삽입 -> .add();
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");
        strSet1.add("2");
        strSet1.add("3");
        System.out.println(strSet1);   // 결과값 : [Java, 1, python, 2, 3] : 순서는 없고 중복은 제거된 것을 확인 가능함

        for(String elem : strSet1) {    // 향상된 for문을 통해 element를 출력하는 것은 가능
            System.out.print(elem + " ");
        }

//        for(int i = 0; i < strSet1.size(); i++) {
//            System.out.println(strSet1.get(i));
//        }                                             // 얘는 Set 상황에서는 작성이 불가능함. 인덱스가 없기 때문

        System.out.println();
        // 특정 element를 추출 -> List로의 형변환을 함
        strList1.addAll(strSet1);   // strList1에 strSet1의 모든 element들을 더한다는 의미
        strList1.addAll(strSet1);
        System.out.println("중복으로 더하고 난 후");
        for(int i = 0; i < strList1.size(); i++) {
            System.out.print(strList1.get(i) + " ");
        }

        System.out.println();
        Collections.sort(strList1);
        System.out.println(strList1);
        // 역순 정렬
        Collections.sort(strList1, Collections.reverseOrder());
        System.out.println(strList1);

        // 새로운 Set을 선언해서 다시 strList1에 있는 부분을 다 더해버리면 중복이 제거됨
        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);
    }
}
