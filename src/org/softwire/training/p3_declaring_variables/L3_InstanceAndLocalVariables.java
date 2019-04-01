package org.softwire.training.p3_declaring_variables;

public class L3_InstanceAndLocalVariables {

    public static void main(String[] args) {

        // ????????????????????????????
        // What is going to be printed?
        // ????????????????????????????

        MyClass myClass = new MyClass();

        myClass.doThing();
        myClass.doThing();
        myClass.doThing();

    }
}


class MyClass {
    private int instanceVariable = 0;

    void doThing() {
        int localVariable = 0;

        instanceVariable++;
        localVariable++;

        System.out.println("instanceVariable: " + instanceVariable);
        System.out.println("localVariable: " + localVariable);
        System.out.println("");
    }

}
//prints out 1&1 1st time, 2&1 second time and 3&1 third time as
//local variable always resets to 0 each time the method is run but instanceVariable
//doesn't
