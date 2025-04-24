package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method를 정의하고 실행시킬겁니다.
    메서드명 : calculateBmi()
    return type : void
    매개변수 유무 : 없음

 */
public class Method04 {
    // 여기에 정의할겁니다.
    public static void calculateBmi() {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        double Bmi;
        String BmiSection= "";
        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble() / 100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();
        Bmi = weight / (height * height);
        if(Bmi > 25.0) {
            BmiSection = "비만";
        } else if(Bmi > 23.0) {
            BmiSection = "과체중";
        } else if(Bmi > 18.5) {
            BmiSection = "정상";
        } else {
            BmiSection = "저체중";
        }
        System.out.println("당신의 BMI 지수는 " + Bmi + "이고, " + BmiSection + "입니다.");
    }

    public static void main(String[] args) {
        /*
            실행 예
            키(cm)를 입력하세요 >>> 172.5
            몸무게(kg)를 입력하세요 >>> 68.7
            당신의 BMI 지수는 23.08이고, 과체중입니다.
         */
        calculateBmi();
    }
}
