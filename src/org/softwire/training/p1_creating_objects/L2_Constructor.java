package org.softwire.training.p1_creating_objects;

public class L2_Constructor {

    public static void main(String[] args) {

        Badger b = new Badger(); //creates instance of a class , gives variable a name b, Badger () is a constructor
        System.out.println("The badger's age is... " + b.age);

    }
}


class Badger {

    public int age; //declares age as an int

    public Badger() {
        age = 2;
    } // constructor that sets Badger age as 2

}
