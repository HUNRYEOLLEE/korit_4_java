package ch23_lambda;

public class CalculatorMain {
    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {

        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (int x, int y) -> x + y;
        Calculator sub = (int x, int y) -> x - y;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> x / y;

        // 정적 메서드 호출
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        Calculator div2 = (x, y) -> {
            if(y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };

        System.out.println("3 / 0 = " + operate(3, 0, div2));
    }
}
