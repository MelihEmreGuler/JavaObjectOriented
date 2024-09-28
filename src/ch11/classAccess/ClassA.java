package ch11.classAccess;

import ch11.classAccess.x.ClassX;

public class ClassA {
    ClassB b = new ClassB();
    ClassX x;

    //'ch11.classAccess. x. ClassZ' is not public in 'ch11.classAccess. x'. Cannot be accessed from outside package
    //ClassZ z;
}
