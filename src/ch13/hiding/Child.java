package ch13.hiding;

public class Child extends Parent{
    protected int i; // Hiding i of Parent
    protected byte b; // Hiding b of Parent
    protected double d;

    // This is hiding of a method
    public static void g(){
        System.out.println("g() in Child");
    }

    // This is overriding of a method
    public void printInfo(){
        System.out.println("i: " + i);
        System.out.println("super.i: " + super.i);
        System.out.println("b: " + b);
        System.out.println("super.b: " + super.b);
        System.out.println("d: " + d);
        g();
        super.g(); // Static member 'ch13.hiding. Parent. g()' accessed via instance reference
        Parent.g(); // This is same as above
    }
}
