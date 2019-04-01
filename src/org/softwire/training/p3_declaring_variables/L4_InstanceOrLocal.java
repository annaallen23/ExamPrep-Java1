package org.softwire.training.p3_declaring_variables;

public class L4_InstanceOrLocal {
}

// ????????????????????
// Which of these are:
// - INSTANCE variables
// - LOCAL variables
// ????????????????????

class SomeClass {
    int intA; //instance as its within the class
    { int intB; } //local as it's within its own brackets
    int intC; //instance of someClass
    public SomeClass() {
        int intD; //local as its within a class
    }
    private void init() {
        int intE; //local as its within a class
    }
}
