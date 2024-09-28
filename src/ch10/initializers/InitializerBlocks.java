package ch10.initializers;

public class InitializerBlocks {

    double d;
    int l;

    {
        System.out.println("\nIn an instance initializer block 1");
        setD();
    }

    {
        long l = 5; // Local var that shadows instance var.
        System.out.println();
    }

    void setD(){
        this.d = Math.random() * 10;
    }
}
