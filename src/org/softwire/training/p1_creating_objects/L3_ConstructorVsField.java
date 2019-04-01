package org.softwire.training.p1_creating_objects;

public class L3_ConstructorVsField {

    public static void main(String[] args) {

        Cat c = new Cat();
        System.out.println("The cat's age is... " + c.age);

    }
}


class Cat {

    public int age = 4; // field

    public Cat() { //constructor
        age = 3;
    }

}
