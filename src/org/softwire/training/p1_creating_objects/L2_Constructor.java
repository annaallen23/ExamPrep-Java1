package org.softwire.training.p1_creating_objects;

public class L2_Constructor {

    public static void main(String[] args) {

        Badger b = new Badger();
        System.out.println("The badger's age is... " + b.age);

    }
}


class Badger {

    public int age;

    public Badger() {
        age = 2;
    }

}
