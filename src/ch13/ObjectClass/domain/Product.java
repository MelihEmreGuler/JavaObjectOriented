package ch13.ObjectClass.domain;

public class Product {
    int no;
    String name;
    double price;

    public Product (int no, String name, double price){
        this.no = no;
        this.name = name;
        this.price = price;
    }


    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product p1 = (Product)obj;
        return no == p1.no;
    }
}
