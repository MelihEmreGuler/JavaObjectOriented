package ch10.bank;

public class BankTest {
    public static void main(String[] args) {
        Customer c2 = new Customer(2, "Kemal");
        CreditCard cc2 = new CreditCard("2", 2500, c2);

        System.out.println("customer: " + c2 + "its credit card: " + c2.cc);
        System.out.println("credit card: " + cc2 + "its owner: " + cc2.owner);

    }
}
