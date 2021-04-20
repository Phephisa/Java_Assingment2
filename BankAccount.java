package lab7;

/*
 *
 * Phephisa Methula 18000797
 * 
 */
public class BankAccount {

    // class instance variables
    private String name = "";
    private String address = "";
    private double currentBalance = 0;

    // default constructor

    public BankAccount() {
        this.name = "";
        this.address = "";
        this.currentBalance = 0;
    }

    // parameterized constructor

    public BankAccount(String n, String a) {
        this.name = n;
        this.address = a;
    }

    // overload constructor
    public BankAccount(String n, String a, double c) {
        this.name = n;
        this.address = a;
        this.currentBalance = c;
    }

    // set and get methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\nAddress : " + this.address + "\nCurrentBalance : " + this.currentBalance;
    }
}
