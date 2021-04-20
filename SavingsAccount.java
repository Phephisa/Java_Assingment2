
package lab7;

/**
 *
 * Phephisa Methula 18000797
 * 
 */
public class SavingsAccount extends BankAccount {

    // instance variables
    private double interestRate;

    private double dailyInterest() {
        return getCurrentBalance() * getInterestRate() / 365;
    }

    // default constructor
    public SavingsAccount() {
        super();
        this.interestRate = 0;
    }

    //
    public SavingsAccount(double interestRate, String n, String a, double c) {
        super(n, a, c);
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, String n, String a) {
        super(n, a);
        this.interestRate = interestRate;
    }

    // get and set methods
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nInterest rate : " + this.interestRate + "\nDaily Interest " + dailyInterest();
    }

}
