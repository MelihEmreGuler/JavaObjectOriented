package ch10.bank;

public class Customer {
    int id;
    String name;

    CreditCard cc;

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setCc(CreditCard cc){
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cc no=" + cc.no +
                '}';
    }
}
