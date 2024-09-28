package ch10.initializers;

import java.time.LocalTime;
import java.util.Arrays;

public class InitializationProblem1 {
    String name;
//    name = "default"; Compiler error.

    double coefficient;
//    coefficient = 0.5; // Compiler error.

    int t = 10;
    static double f;

    static {
        // Compiler error.
        //Non-static field 't' cannot be referenced from a static context
        //Since static variables get their values when the program classes are loaded,
        // the value t here is not initialized yet
        // and the object instance variable cannot be accessed in the static initialization block.
        //t = 20;
        // f = t * Math.random();
    }

    static int[] ints = new int[10];


    InitializationProblem1(){
        name = "default";

        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.NOON))
            coefficient = 2;
        else
            coefficient = 4;

        System.out.println("\nInitializing the static array.");
        for (int i = 0; i < ints.length; i++)
            ints[i] = (i + 1) * 10;
    }

    InitializationProblem1(String name){
        this();
        this.name = name;
    }

    @Override
    public String toString() {
        return "InitializationProblem1{" +
                "name='" + name + '\'' +
                ", coefficient=" + coefficient +
                ", static ints= " + Arrays.toString(ints) +
                '}';
    }
}
