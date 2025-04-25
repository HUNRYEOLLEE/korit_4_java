package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        // 금액이 잘못 입력된 사례
        bank1.setBalance(-10);
        bank1.setBalance(100000);
        // 비밀번호가 허용범위를 초과하여 입력되어 실패한 사례
        bank1.setPinNumber(-1234);
        bank1.setPinNumber(1234);

        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(9876);

        // 비밀번호 실패 사례
        bank1.deposit(10000, 1734);
        // 입금 성공 사례
        bank1.deposit(50000, 1234);
        // 잔액이 부족하여 출금 실패 사례
        bank1.withdraw(200000, 1234);
        // 출금 성공 사례
        bank1.withdraw(100000, 1234);

        System.out.println();

        bank2.withdraw(100000, 9876);
        bank2.deposit(200000, 9876);

        System.out.println();

        bank1.displayInfo();
        bank2.displayInfo();
    }
}
