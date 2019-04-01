package org.softwire.training.p1_creating_objects;

public class L7_OrderOfInitialisation {

    public static void main(String[] args) {

        Giraffe g = new Giraffe();
        System.out.println("The giraffe's age is... " + g.age);

    }
}


class Giraffe {

    {
        age = 5;//instance initialiser (don't use)
    }

    public int age = 4; //setting value of age field

    public Giraffe() {//constructor gets run last
        age = 3;
    }

    {
        age = 6;//instance initialiser (don't use)
    }

}
