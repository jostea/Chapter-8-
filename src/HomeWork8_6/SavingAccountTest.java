package HomeWork8_6;

public class SavingAccountTest {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.annualInterestRate = 0.04/12;

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

        SavingsAccount.annualInterestRate = 0.05/12;

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());
    }
}
