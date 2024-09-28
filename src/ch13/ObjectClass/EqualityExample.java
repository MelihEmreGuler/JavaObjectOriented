package ch13.ObjectClass;

import ch13.ObjectClass.domain.Product;

public class EqualityExample {
    public static void main(String[] args) {
        Product p1 = new Product(11, "Kanepe", 171.09);
        Product p2 = new Product(11, "Kanepe", 171.09);

        System.out.print("Is p1 == p2: ");
        if (p1 == p2)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.print("Is p1 equals p2: ");

        if(p2.equals(p1))
            System.out.println("The same");
        else
            System.out.println("Different");
    }



}
