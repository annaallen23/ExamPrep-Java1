package org.softwire.training.p1_creating_objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class L6_NeverUseInstanceInitialisers {

    public static void main(String[] args) {

        Frog f = new Frog();
        System.out.println("The frog's age is... " + f.age);

    }
}


class Frog {

    public int age;

    public Frog() {
        // They say elephants never forget.
        // That's because they keep a really good diary
        String diary = L6Utils.readFile("C:\\Work\\New starter training\\Code\\ExamPrep\\src\\org\\softwire\\training\\L5_diary.txt");

        String searchFor = "birthday party";

        age = 0;
        for (int i = 0; i < diary.length(); i++) {
            if (L6Utils.substring(diary, i, searchFor.length()).equals(searchFor)) {
                age = age + 1;
            }
        }

    }

}






























class L6Utils {
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