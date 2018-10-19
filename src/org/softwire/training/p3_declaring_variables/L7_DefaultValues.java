package org.softwire.training.p3_declaring_variables;

public class L7_DefaultValues {

    public static void main(String[] args) {

        // ?????????????????????
        // What will this print?
        // ?????????????????????

        ClassyClass classyClass = new ClassyClass();

        System.out.println("theBool: " + classyClass.theBool);
        System.out.println("theInt: " + classyClass.theInt);
        System.out.println("theDouble: " + classyClass.theDouble);
        System.out.println("theChar: " + classyClass.theChar);
        System.out.println("theString: " + classyClass.theString);

    }
}


class ClassyClass {
    boolean theBool;
    int theInt;
    double theDouble;
    char theChar;
    String theString;
}
