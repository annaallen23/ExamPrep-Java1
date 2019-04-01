package org.softwire.training.p2_primitive_types;

public class L4_Char {

    public static void main(String[] args) {

        char aChar = 'a';
        System.out.println(aChar); //prints out a
        aChar++; //adds one letter to a
        System.out.println(aChar); //therefore print out b

        String helloWorld = "Hello, World!";

        char charZero = helloWorld.charAt(0);
        System.out.println(charZero); // H is at position 0

        char[] arrayOfChars = helloWorld.toCharArray();
        System.out.println(arrayOfChars[0]); // H is at index 0 in the array list
    }
}
