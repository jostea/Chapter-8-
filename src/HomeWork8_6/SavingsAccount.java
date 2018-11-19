package HomeWork8_6;

public class SavingsAccount {
    private double savingsBalance;
    static double annualInterestRate;

    public SavingsAccount(double savingsBalance) {
        setSavingsBalance(savingsBalance);
    }

    double calculateMonthlyInterest() {
        return savingsBalance + (savingsBalance * annualInterestRate );
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

}
