package ch12_arrays;
/*
    다차원 배열(Multi Demensional Array) 중 2차원 배열
    : 다차원 배열은 2차원 배열 이상을 의미한다.

    형식 :
    int[][] arr01 = new int[크기][크기];                // - 선언 방식 # 1
    int[][] arr02 = new int[크기][];                   // - 선언 방식 # 2
    int[][] arr03 = { {1, 2}, {3, 4}, {5, 6} };       // - 선언 방식 # 3 및 초기화

    2차원 배열의 선언 시, '열'의 크기는 지정하지 않아도 되지만, '행'의 크기는 항상 지정해야함.
    -> 선언 방식 # 2를 말로 풀어낸 설명입니다.
    1열 2열(column)
     ↓  ↓
    {1, 2},     → 1행(row)
    {3, 4},     → 2행(row)
    {5, 6}      → 3행(row)
 */
public class Array07 {
    public static void main(String[] args) {
        int[][] arr03 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // 4를 출력하시오.
//        System.out.println(arr03[1][1]);
        // 5를 출력하시오/
//        System.out.println(arr03[2][0]);

        // 2차 배열에서의 element 출력 방법
        for(int[] arr031 : arr03) {
//            System.out.println(arr031);
            for(int arr0311 : arr031) {
                System.out.print(arr0311);
            }
        }
        System.out.println();
        System.out.println("-- 이하는 일반 for문으로 작성 --");
        for(int i = 0; i < arr03.length; i++) {
//            System.out.println(arr03[i]);
            for(int j = 0; j < arr03[i].length; j++) {
                System.out.print(arr03[i][j]);
            }
        }
    }
}
