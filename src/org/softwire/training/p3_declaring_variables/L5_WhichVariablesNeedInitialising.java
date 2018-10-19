package org.softwire.training.p3_declaring_variables;

public class L5_WhichVariablesNeedInitialising {

    public static void hello(String[] args) {

        // ????????????????
        // Will these work?
        // ????????????????

        Tiger tiger = new Tiger();
//        System.out.println("tiger.age: " + tiger.age);
//        System.out.println("tiger.hasFur: " + tiger.hasFur);
//        System.out.println("tiger.name: " + tiger.name);

        int myAge;
        boolean doIHaveFur;
        String myName;
//        System.out.println("myAge: " + myAge);
//        System.out.println("doIHaveFur: " + doIHaveFur);
//        System.out.println("myName: " + myName);

    }
}


class Tiger {
    public int age;
    public boolean hasFur;
    public String name;
}
