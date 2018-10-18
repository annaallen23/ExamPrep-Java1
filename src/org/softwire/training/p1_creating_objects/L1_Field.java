package org.softwire.training.p1_creating_objects;

public class L1_Field {

    public static void main(String[] args) {

        Ant a = new Ant();
        System.out.println("The ant's age is... " + a.age);

    }
}


class Ant {

    public int age = 1;

}
