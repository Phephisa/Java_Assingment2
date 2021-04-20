
package lab7;

/**
 *Phephisa Methula 18000797
 *
 */
public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount c = new SavingsAccount();

        c.setName("fnb");
        c.setAddress("Py");
        c.setCurrentBalance(400);
        c.setInterestRate(.125);

        System.out.println(c.toString());

        BankAccount b = new SavingsAccount(.128, "Worker Bee", "Gc", 12000);
        System.out.println(b.toString());
    }
}
