package org.softwire.training.p1_creating_objects;

public class L4_NotConstructor {

    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println("The dog's age is... " + d.age);

    }
}


class Dog {

    public int age = 5; //field

    public void Dog() {
        age = 6;
    } //method, doesn't run as no return type

}
