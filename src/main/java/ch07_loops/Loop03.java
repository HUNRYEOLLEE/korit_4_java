package ch07_loops;
/*
    while문을 사용하여

    1 2 3 4 5 6 7 8 9 10
    11 12 13 14 15 16 17 18 19 20
    ...
    91 92 93 94 95 96 97 98 99 100
    이 출력되도록 작성하시오.

 */
public class Loop03 {
    public static void main(String[] args) {
        // #1 반복을 100번 돌리는 방법
        int i = 1;
        while(i < 101){
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
            i++;
        }

        System.out.println();

        // #2 반복을 10번 돌리는 방법
        int j = 1;
        while(j < 101) {
            System.out.println(j + " " + (j + 1) + " " + (j + 2) + " " + (j + 3) + " "
                    + (j + 4) + " " + (j + 5) + " " + (j + 6) + " "
                    + (j + 7) + " " + (j + 8) + " " + (j + 9));
            j += 10;
        }
    }
}
