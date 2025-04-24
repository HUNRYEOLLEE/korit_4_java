package ch07_loops;

import java.util.Scanner;

/*
    for(int i = 0; i < 10; i++) {
        (반복실행문1-a)
        for(int j = 0; j < 10; j++) {
            반복실행문2
        }
        (반복실행문1-b)
        for(int k = 0; k < 10; k++) {
            반복실행문3
        }
        (반복실행문1-c)
    }

    문제)
    *
    **
    ***
    ****
    *****

 */
public class Loop06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별찍기를 실행하시겠습니까? >>> ");
        int row = scanner.nextInt();

        // 실행 예
        // 몇 줄의 별찍기를 실행하시겠습니까? >>> 6
        /*
            *
            * *
            * * *
         */

//        for(int i = 1; i < row + 1; i++) {  // 1차 for문은 개행의 숫자와 관련있음
//            for(int j = 0; j < i; j++) {    // 2차 for문의 경우에는 별이 찍히는 횟수와 관련있음
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 실행 예
        // 몇 줄의 별찍기를 실행하시겠습니까? >>> 6
        /*
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */

        // # 풀이 1
//        for(int i = row; i > 0; i--) {
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // # 풀이 2
        for(int i = 0; i < row; i++ ) {
            for(int j = row; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
