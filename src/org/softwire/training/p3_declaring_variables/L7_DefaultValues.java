package org.softwire.training.p3_declaring_variables;

public class L7_DefaultValues {

    public static void main(String[] args) {

        // ?????????????????????
        // What will this print?
        // ?????????????????????

        ClassyClass classyClass = new ClassyClass();

        System.out.println("theBool: " + classyClass.theBool); //false
        System.out.println("theInt: " + classyClass.theInt); //0
        System.out.println("theDouble: " + classyClass.theDouble); //0
        System.out.println("theChar: " + classyClass.theChar); //null incorrect will print out nothing
        System.out.println("theString: " + classyClass.theString); //null

    }
}


class ClassyClass {
    boolean theBool;
    int theInt;
    double theDouble;
    char theChar;
    String theString;
}
