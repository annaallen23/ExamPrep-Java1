package org.softwire.training.p1_creating_objects;

public class L7_OrderOfInitialisation {

    public static void main(String[] args) {

        Giraffe g = new Giraffe();
        System.out.println("The giraffe's age is... " + g.age);

    }
}


class Giraffe {

    {
        age = 5;
    }

    public int age = 4;

    public Giraffe() {
        age = 3;
    }

    {
        age = 6;
    }

}
