package org.softwire.training.p3_declaring_variables;

public class L5_WhichVariablesNeedInitialising {

    public static void hello(String[] args) {

        // ????????????????
        // Will these work?
        // ????????????????

        Tiger tiger = new Tiger();
    //    System.out.println("tiger.age: " + tiger.age);
    //    System.out.println("tiger.hasFur: " + tiger.hasFur);
    //    System.out.println("tiger.name: " + tiger.name);

        int myAge; //need initialising as local variables within a method
        boolean doIHaveFur;
        String myName;

    //    System.out.println("myAge: " + myAge);
    //    System.out.println("doIHaveFur: " + doIHaveFur);
    //    System.out.println("myName: " + myName);

    }
}


class Tiger {
    public int age; //don't need initialising as set to default as instance
    public boolean hasFur;
    public String name;
}
