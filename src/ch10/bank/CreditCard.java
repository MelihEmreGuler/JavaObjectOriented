package ch10.bank;

public class CreditCard {
    String no;
    double balance;

    Customer owner;

    public CreditCard(String no, double balance){
        this.no = no;
        this.balance = balance;
    }

    public CreditCard(String no, double balance, Customer owner){
        this(no, balance);
        this.owner = owner;
        owner.setCc(this);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "no='" + no + '\'' +
                ", balance=" + balance +
                ", owner name=" + owner.name +
                '}';
    }
}
