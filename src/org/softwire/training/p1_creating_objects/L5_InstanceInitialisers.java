package org.softwire.training.p1_creating_objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class L5_InstanceInitialisers {

    public static void main(String[] args) {

        Elephant e = new Elephant();
        System.out.println("The elephant's age is... " + e.age);

    }
}


class Elephant {//uses Instance intialiser block instead of constructor shouldn't do this!

    public int age;

    {
        // They say elephants never forget.
        // That's because they keep a really good diary
        String diary = L5Utils.readFile("/Users/anna.allen/documents/work/training/ExamPrep-Java1/src/org/softwire/training/p1_creating_objects/L5_diary.txt");

        String searchFor = "birthday party";

        age = 0;
        for (int i = 0; i < diary.length(); i++) { //iterates through the list to find each instance of Birthday Party
            if (L5Utils.substring(diary, i, searchFor.length()).equals(searchFor)) { // adds one onto age for each instance
                age = age + 1;
            }
        }

    }

}


























class L5Utils {
    static String readFile(String filename) {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException ignored) {
            return null;
        }
    }

    static String substring(String input, int beginIndex, int length) {
        int endIndex = Math.min(beginIndex + length, input.length());
        return input.substring(beginIndex, endIndex);
    }
}